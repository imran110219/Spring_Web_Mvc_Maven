<%--
  Created by IntelliJ IDEA.
  User: Sadman
  Date: 4/1/2018
  Time: 2:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Registration</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="robots" content="all,follow">
    <!-- Bootstrap CSS-->
    <link rel="stylesheet" href="/static/vendor/bootstrap/css/bootstrap.min.css">
    <!-- Font Awesome CSS-->
    <link rel="stylesheet" href="/static/vendor/font-awesome/css/font-awesome.min.css">
    <!-- Fontastic Custom icon font-->
    <link rel="stylesheet" href="/static/css/fontastic.css">
    <!-- Google fonts - Roboto -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700">
    <!-- jQuery Circle-->
    <link rel="stylesheet" href="/static/css/grasp_mobile_progress_circle-1.0.0.min.css">
    <!-- Custom Scrollbar-->
    <link rel="stylesheet" href="/static/vendor/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.css">
    <!-- theme stylesheet-->
    <link rel="stylesheet" href="/static/css/style.default.css" id="theme-stylesheet">
    <!-- Custom stylesheet - for your changes-->
    <link rel="stylesheet" href="/static/css/custom.css">
    <!-- Favicon-->
    <link rel="shortcut icon" type="image/x-icon" href="/static/img/favicon.ico" />
    <!-- Tweaks for older IEs--><!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script><![endif]-->
</head>
<body>
<div class="page login-page">
    <div class="container">
        <div class="form-outer text-center d-flex align-items-center">
            <div class="form-inner">
                <div class="logo text-uppercase"><span>Employee</span><strong class="text-primary">Information</strong></div>
                <p>Fill the information.</p>
                <form:form method="POST" modelAttribute="employee"  class="text-left form-validate">
                    <form:input type="hidden" path="id" id="id"/>
                    <div class="form-group-material">
                        <form:input path="fullName" id="fullName" type="text" name="fullName" data-msg-required="Please enter your username" class="input-material"/>
                        <label for="fullName" class="label-material">Fullname</label>
                        <div class="has-error">
                            <form:errors  path="fullName" class="help-inline"></form:errors>
                            <label id="fullName-error" class="error"></label>
                        </div>
                    </div>
                    <div class="form-group-material">
                        <form:input path="name" id="name" type="text" name="name" data-msg-required="Please enter your username" class="input-material"/>
                        <label for="name" class="label-material">Email Address      </label>
                        <div class="has-error">
                            <form:errors  path="name" class="help-inline"></form:errors>
                            <label id="name-error" class="error"></label>
                        </div>
                    </div>
                    <div class="form-group-material">
                        <form:input path="joiningDate" id="joiningDate" type="text" name="joiningDate" data-msg-required="Please enter your username" class="input-material"/>
                        <label for="joiningDate" class="label-material">Joining Date      </label>
                        <div class="has-error">
                            <form:errors  path="joiningDate" class="help-inline"></form:errors>
                            <label id="joiningDate-error" class="error"></label>
                        </div>
                    </div>
                    <div class="form-group-material">
                        <form:input path="salary" id="salary" type="text" name="salary" data-msg-required="Please enter your username" class="input-material"/>
                        <label for="salary" class="label-material">Salary      </label>
                        <div class="has-error">
                            <form:errors  path="salary" class="help-inline"></form:errors>
                            <label id="salary-error" class="error"></label>
                        </div>
                    </div>
                    <div class="form-group-material">
                        <form:input path="ssn" id="ssn" type="text" name="ssn" data-msg-required="Please enter your username" class="input-material"/>
                        <label for="ssn" class="label-material">SSN      </label>
                        <div class="has-error">
                            <form:errors  path="ssn" class="help-inline"></form:errors>
                            <label id="ssn-error" class="error"></label>
                        </div>
                    </div>
                    <%--<div class="form-group-material">--%>
                        <%--<input id="register-password" type="password" name="registerPassword" required data-msg="Please enter your password" class="input-material">--%>
                        <%--<label for="register-password" class="label-material">Password        </label>--%>
                    <%--</div>--%>
                    <div class="form-group terms-conditions text-center">
                        <input id="register-agree" name="registerAgree" type="checkbox" required value="1" data-msg="Your agreement is required" class="form-control-custom">
                        <label for="register-agree">I agree with the terms and policy</label>
                    </div>
                    <div class="form-group text-center">
                        <input id="register" type="submit" value="Register" class="btn btn-primary">
                    </div>
                </form:form>
                <small>Already have an account? </small><a href="login.html" class="signup">Login</a>
            </div>
            <div class="copyrights text-center">
                <p>Design by <a href="https://bootstrapious.com" class="external">Bootstrapious</a></p>
                <!-- Please do not remove the backlink to us unless you support further theme's development at https://bootstrapious.com/donate. It is part of the license conditions. Thank you for understanding :)-->
            </div>
        </div>
    </div>
</div>
<!-- JavaScript files-->
<script src="<c:url value='/static/vendor/jquery/jquery.min.js' />"></script>
<script src="<c:url value='/static/vendor/popper.js/umd/popper.min.js' />"></script>
<script src="<c:url value='/static/vendor/bootstrap/js/bootstrap.min.js' />"></script>
<script src="<c:url value='/static/js/grasp_mobile_progress_circle-1.0.0.min.js' />"></script>
<script src="<c:url value='/static/vendor/jquery.cookie/jquery.cookie.js' />"></script>
<script src="<c:url value='/static/vendor/chart.js/Chart.min.js' />"></script>
<script src="<c:url value='/static/vendor/jquery-validation/jquery.validate.min.js' />"></script>
<script src="<c:url value='/static/vendor/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.concat.min.js' />"></script>
<!-- Main File-->
<script src="<c:url value='/static/js/front.js' />"></script>
</body>
</html>
