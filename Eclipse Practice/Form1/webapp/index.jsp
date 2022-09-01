<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FORM 1</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>
<body>
<div class="jumbotron"><h1>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;STUDENT FORM - 1</h1></div>
<div class = "container">
		<form action="studentResponse" class="card" method="post">
			<table class = "table">
				<tr>
					<td><b>First Name</b></td>
					<td><input type="text" name="firstName" placeholder="Enter First Name"></td>
				</tr>
				<tr>
					<td><b>Last Name</b></td>
					<td><input type="text" name="lastName" placeholder="Enter Last Name"></td>
				</tr>
				<tr>
					<td><b>Gender</b></td>
					<td><input type="radio" name="gender" value="Male">Male &nbsp;&nbsp;
					<input type="radio" name="gender" value="Female">Female</td>
				</tr>
				<tr>
					<td><b>Country <b></td>
					<td>
						<select name="country">
							<option value="India">India</option>
							<option value="USA">USA</option>
							<option value="Russia">Russia</option>
							<option value="Japan">Japan</option>
							<option value="China">China</option>
						</select>
					</td>
				</tr>
				<tr>
					<td><b>Programing Languages</b></td>
					<td>
						<input type="checkbox" name="plang" value="Java">&nbsp;Java &ensp;&ensp;&ensp;&ensp;
						<input type="checkbox" name="plang" value="Python">&nbsp;Python<br/>
						<input type="checkbox" name="plang" value="C">&nbsp;C &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&nbsp;
						<input type="checkbox" name="plang" value="C++">&nbsp;C++
					</td>
				</tr>
				<tr>
					<td></td>
					<td><button type="submit">Submit</button> &nbsp;&nbsp; <button type="reset">Reset</button></td>
				</tr>
			</table>
		</form>
</div>
<%@include file="footer.jsp"  %>
</body>
</html>