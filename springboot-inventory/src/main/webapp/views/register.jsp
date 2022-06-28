<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dealer Registration</title>
<link rel="stylesheet" href="/ims/resources/static/css/register.css">
</head>
<body>
	<div class="form">
		<h3>Dealers Registration</h3>
		<form:form id="registrationform" action="saveDealer" method="post"
			modelAttribute="dealer">

			<p class="contact">
				<label for="fname">Email</label>
			</p>
			<input id="email" name="email" placeholder="Enter Email" required
				tabindex="1" type="email">


			<p class="contact">
				<label for="fname">First Name</label>
			</p>
			<input id="fname" name="fname" placeholder="Enter first name"
				required tabindex="2" type="text">

			<p class="contact">
				<label for="lname">Last Name</label>
			</p>
			<input id="lname" name="lname" placeholder="Enter last name" required
				tabindex="3" type="text">

			<p class="contact">
				<label for="password">Enter a password</label>
			</p>
			<input type="password" id="password" name="password" required
				tabindex="4">

			<label for="birthday">Birthday:</label>
			<input type="date" id="dob" name="dob" tabindex="5">
			<p class="contact">
				<label for="phone">Mobile phone</label>
			</p>
			<input id="phone" name="phoneNo" placeholder="phone number" required
				tabindex="6" type="tel" pattern="[0-9]{10}">

			<p class="street">
				<label for="street">Address</label>
			</p>
			<input id="street" name="street" placeholder="Street Address"
				required tabindex="7" type="text">

			<select class="select-style city" name="city" tabindex="8">

				<option value="select">Select Your City</option>
				<option value="Bangalore">Bangalore</option>
				<option value="Chennai">Chennai</option>
				<option value="Delhi">Delhi</option>
				<option value="Kolkatta">Kolakatta</option>
				<option value="Mumbai">Mumbai</option>
			</select>
			<br>
			<br>
			<p class="pincode">
				<label for="pincode">Pin Code</label>
			</p>
			<input id="pincode" name="pincode" placeholder="Enter Pin Code"
				required tabindex="9" type="text">
			<br>
			<input class="buttom" name="submit" id="submit" tabindex="9"
				value="Sign me up!" type="submit">
		</form:form>
	</div>
</body>
</html>