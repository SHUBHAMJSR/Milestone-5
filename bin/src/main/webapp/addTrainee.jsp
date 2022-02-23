<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add new Trainee</title>
  <script src="validate.js"></script> 	
</head>
<body>
<form action="TrainingController.do" method="post">
	<input type="hidden" name="id" value="0"/>
    <table>
        <tr>
            <td>Enter Trainee id:</td>
            <td><input type="number" name="trainee_id" id="tid" /></td>
            <td><label id="tMsg"></label></td>
        </tr>

        <tr>
            <td>Enter Trainee name:</td>
            <td><input type="text" name="trainee_name" id="tnameid" /></td>
            <td><label id="tnameMsg"></label></td>
        </tr>


        <tr>
            <td>Enter Branch:</td>
            <td><input type="text" name="tbranch" id="branchId" /></td>
            <td><label id="branchMsg"></label></td>
        </tr>


        <tr>
            <td>Enter Percentage:</td>
            <td><input type="number" name="per" id="perId" /></td>
            <td><label id="perMsg"></label></td>
        </tr>

        <tr>
            <td><input type="submit" onclick="return validate();" /></td>
        </tr>
    </table>