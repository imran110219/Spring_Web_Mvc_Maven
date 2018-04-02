<%--
  Created by IntelliJ IDEA.
  User: Sadman
  Date: 3/21/2018
  Time: 1:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<head>
    <title>Home Page</title>
</head>
<body>
<div>
    <div>
        <h4>Select any of the options below to send sample email:</h4>
        <form method="get" style="width: 200px;">
            <fieldset style="border: none; padding-left: 0px; padding-top: 0px">

                <table>
                    <tr>
                        <td>
                            <%--<input type="submit" formaction="mail/send" value="Send Simple Email">--%>
                            <a href="<c:url value='/send' />">Send Simple Email</a></br>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="submit" formaction="mail/sendTemplate" value="Send Email Using Template">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="submit" formaction="mail/sendAttachment" value="Send Email With Attachment">
                        </td>
                    </tr>
                </table>
            </fieldset>
        </form>
    </div>
</div>
</body>
</html>
