<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="login.css" >
</head>
<body>
<div align="center" style="padding-top: 80px;">
<form name="reg" method="post" action="magazine/insert">
<table>
<tr>
<td></td>
<td colspan="2" style="font-size: 30px;font-family: Courier New;"><strong>INSERT MAGAZINE</strong><br><br></td>
</tr>
<tr>
<td style="font-size: 25px; font-family: Courier New;"><strong>Name</strong><br><br></td>
<td><input class="inputstyle" type="text" name="sname" placeholder="Name" required=""><br><br></td>
</tr>
<tr>
<td style="font-size: 25px; font-family: Courier New;"><strong>Author</strong><br><br></td>
<td><input class="inputstyle" type="text" name="sauthor" placeholder="Author" required=""><br><br></td>
</tr>
<tr>
<td style="font-size: 25px; font-family: Courier New;"><strong>Publication</strong><br><br></td>
<td><input class="inputstyle" type="text" name="spublication" placeholder="Publication" required=""><br><br></td>
</tr>
<tr>
<td style="font-size: 25px; font-family: Courier New;"><strong>Date</strong><br><br></td>
<td><input class="inputstyle" type="date" name="sdate" placeholder="Date" required=""><br><br></td>
</tr>
<tr>
<td style="font-size: 25px; font-family: Courier New;"><strong>Price</strong><br><br></td>
<td><input class="inputstyle" type="number" name="sprice" placeholder="Price" required=""><br><br><br></td>
</tr>
<td style="font-size: 25px; font-family: Courier New;"><strong>Category</strong><br><br></td>
<td><input class="inputstyle" type="text" name="scategory" placeholder="Category" required=""><br><br><br></td>
</tr>
<td style="font-size: 25px; font-family: Courier New;"><strong>Description</strong><br><br></td>
<td><input class="inputstyle" type="text" name="sdescription" placeholder="Description" required=""><br><br><br></td>
</tr>
<td style="font-size: 25px; font-family: Courier New;"><strong>ratings</strong><br><br></td>
<td><input class="inputstyle" type="text" name="srating" placeholder="rating" required=""><br><br><br></td>
</tr>

<td><input type="submit" value="Insert" class="logButton"></td>
</tr>

</table>
</form>
</div>
</body>
</html>