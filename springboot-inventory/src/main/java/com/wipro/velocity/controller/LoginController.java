package com.wipro.velocity.controller;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.velocity.model.Address;
import com.wipro.velocity.model.Dealer;
import com.wipro.velocity.model.Product;
import com.wipro.velocity.service.LoginService;
import com.wipro.velocity.service.ProductService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService lservice;
	
	@Autowired
	private ProductService pservice;
	
	// Request --> FC--> Controller ---> Response(views- jsp)
	//http://localhost:8085/ims/
    @RequestMapping("/")
    public String viewHomePage() {
           
        return "index";
    }
 // Request --> FC--> Controller ---> Response(views- jsp)
    @RequestMapping("/register")
    public String viewRegisterPage(Model model) {
         Dealer dealer = new Dealer();
            model.addAttribute("dealer", dealer);
              return "register"; //model+view  
    }
    @GetMapping("/login")
    public String showLoginForm(Model theModel) {
       
        return "login";
    }
    // Request --> Controller ---> Service--> DealerRepository--> JPA Repository -->
    // UserRepository-->Service ---> Controller ---> Response(views- jsp)
    @PostMapping("/saveDealer")
    public String saveDealer(HttpServletRequest req,@ModelAttribute("dealer") Dealer dealer) {
        String s=req.getParameter("street");
        String c=req.getParameter("city");
        int p=Integer.parseInt(req.getParameter("pincode"));
        Address a=new Address();
        a.setStreet(s);
        a.setCity(c);
        a.setPincode(p);
       
        dealer.setAddress(a);
        a.setDealer(dealer);
       
        lservice.saveDealer(dealer); // interacts with service layer for db logic implementation
        return "index";
    }
    private String encryptPass(String pass) {
        Base64.Encoder encoder = Base64.getEncoder();
        String normalString = pass;
        String encodedString = encoder.encodeToString(
        normalString.getBytes(StandardCharsets.UTF_8) );
        return encodedString;
    }
    @PostMapping("/loginDealer")
    public ModelAndView loginDealer(HttpServletRequest req,@ModelAttribute("dealer") Dealer dealer) {
        String email=req.getParameter("email");
        String pass=req.getParameter("password");
        String pass2=encryptPass(pass);  //invokes encryptPass() method
        StringTokenizer st = new StringTokenizer(email, "@"); // breaks the email id based on '@' token
        String s2 = st.nextToken(); //email id without domains
       
         ModelAndView mav=null;
         Dealer d = lservice.findByEmail(email); //fetch record/object from 2 tables matching email id fr
        
         if(d==null) {
             mav= new ModelAndView("login");
                mav.addObject("error", "User Doesn't Exists");
         }
         else  if(email.equals(d.getEmail()) && pass2.equals(d.getPassword()))
         {
                    
         req.getSession().setAttribute("user", s2);    // creating a session
        
          mav = new ModelAndView("products");
         mav.addObject("dealer", d);
        
         List<Product> listProducts = pservice.listAll();
         mav.addObject("listProducts", listProducts);
         }
         
         else
         {mav= new ModelAndView("login");
            mav.addObject("error", "Invalid  Password");
         }
        
         return mav;
    }
    @GetMapping("/logout")
    public String logout(HttpServletRequest req) {
        req.getSession().removeAttribute("user");
        req.getSession().invalidate();
        return  "index";
    }
}
