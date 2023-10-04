<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Student Admission</title>
</head>
<body>
<h1>Student Admission Form</h1>

<form action="admission" method="post">
  <%--@declare id="gender"--%><label for="firstName">First Name:</label>
  <input type="text" id="firstName" name="firstName" required><br>

  <label for="lastName">Last Name:</label>
  <input type="text" id="lastName" name="lastName" required><br>

  <label for="age">Age:</label>
  <input type="number" id="age" name="age" required><br>

  <label for="program">Program:</label>
  <input type="text" id="program" name="program" required><br>

  <label for="department">Department:</label>
    <select id="department" name="department">
      <option value="Software Engineering">Software Engineering</option>
      <option value="Information Management">Information Management</option>
      <option value="Networking and Telecommunication Systems">Networking and Telecommunication Systems</option>
    </select><br>

  <label for="phoneNumber">Phone Number:</label>
  <input type="tel" id="phoneNumber" name="phoneNumber" required><br>

  <label for="email">Email:</label>
  <input type="email" id="email" name="email" required><br>

  <label for="gender">Gender:</label>
  <input type="radio" id="male" name="gender" value="Male">Male
  <input type="radio" id="female" name="gender" value="Female">Female
  <input type="radio" id="other" name="gender" value="Other">Other<br>

  <label for="address">Address:</label>
  <textarea id="address" name="address" rows="2" cols="30" required></textarea><br>

  <label for="password">Password:</label>
  <input type="password" id="password" name="password" required><br>

  <input type="submit" value="Submit">
</form>
</body>
</html>
