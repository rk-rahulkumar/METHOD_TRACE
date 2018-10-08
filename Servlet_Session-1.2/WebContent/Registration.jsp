<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<!-- HTML page title -->
<title>Registration</title>
<!-- link of RegistrationScript.js file -->
<script type="text/javascript" src="RegistrationScript.js"></script>
<!-- link of RegistrationStyle.css file -->
<link rel="styleSheet" type="text/css" href="RegistrationStyle.css ">
</head>

<body>

	<!-- HTML semantic tag -->
	<section>

		<!-- HTML header -->
		<h1>Registration Form</h1>

		<form action="Validation" method="get">
			<!-- Table For Data To Symmetric -->
			<table>

				<!-- first Name -->
				<tr>
					<td><span class="span">*</span>First Name</td>
					<td><input type="text" name="firstName" required="required"></td>
				</tr>

				<!-- Last Name -->
				<tr>
					<td><span class="span">*</span>Last Name</td>
					<td><input type="text" name="lastName" required="required"></td>
				</tr>

				<!-- Password -->
				<tr>
					<td><span class="span">*</span>Password</td>
					<td><input type="password" name="password" required="required"></td>
				</tr>

				<!--  Confirm Password -->
				<tr>
					<td><span class="span">*</span>Confirm Password</td>
					<td><input type="password" name="confirmPassword"
						required="required"></td>
				</tr>

				<!--  Age Field -->
				<tr>
					<td><span class="span">*</span>Age</td>
					<td><input type="number" name="age" min="12" max="75"
						step="any" required="required"></td>
				</tr>

				<!--  State Name -->
				<tr>
					<td><span class="span">*</span>State</td>
					<td><select style="width: 100%;" id="state" name="state"
						onchange="selectCity()">
							<option selected="selected" disabled="disabled" value="">Select
								State</option>
							<option value="Rajasthan">Rajasthan</option>
							<option value="MP">Madhya Pradesh</option>
							<option value="Maharastra">Maharastra</option>
							<option value="UP">Uttar Pradesh</option>
					</select></td>
				</tr>

				<!-- City Name based on state-->
				<tr>
					<td><span class="span">*</span>City</td>
					<td><select style="width: 100%;" id="city" name="city">
							<option selected="selected" disabled="disabled" value="">Select
								City</option>
					</select></td>
				</tr>

				<!--  Address -->
				<tr>
					<td><span class="span">*</span>AddressLine</td>
					<td><textarea style="width: 100%;" name="addressLine"></textarea></td>
				</tr>
				<!-- check box -->
				<tr>
					<td colspan="2"><input type="checkbox" id="checkbox"
						onchange="activateSubmit()">I accept all terms and
						conditions.</td>
				</tr>

				<!-- Submission Button -->
				<tr>
					<td colspan="2" align="right"><input type="submit"
						disabled="disabled" id="submit"></td>
				</tr>
			</table>
		</form>
		<p align="center"
			style="color: red; font-size: 20px; font-weight: bold;">${param.message}</p>
	</section>

</body>

</html>