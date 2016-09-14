<%-- 
    Document   : uderView
    Created on : May 27, 2016, 11:08:08 PM
    Author     : Thamira
--%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
            /*            .myprop{
                            td {
                                width: 100px;
                            }
                            
                        }*/
            .headertag{
                text-align: center;
                color: #269abc;
                font-size: 30px;
            }

        </style>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>


        <div class="container-fluid">



            <div class="row">

                <div class="col-md-4 ">
                    <div style="text-align: center;">
                        <img src="1.jpg"/>
                        <br>
                    </div>

                </div>  
                <div  class="col-md-6">
                    <p class="headertag" >Personal Information</p><br><br><br>
                    <table class="table myprop">
                        <tr>
                            <td>NIC</td>
                            <td><c:out value=": ${personaldetail.nic}"></c:out></td>
                                </td>
                            <tr>
                                <td>Full Short Name</td>
                                <td><c:out value=": ${personaldetail.shortName}"></c:out></td>
                            </tr>
                            <tr>
                                <td>Full Name</td>
                                <td><c:out value=": ${personaldetail.fullName}"></c:out></td>
                            </tr>
                            <tr>
                                <td>Age</td>
                                <td><c:out value=": ${personaldetail.age}"></c:out></td>
                            </tr>
                            <tr>
                                <td>Address</td>
                                <td><c:out value=": ${personaldetail.address}"></c:out></td>
                            </tr>
                            <tr>
                                <td>Mobile Number</td>
                                <td><c:out value=": ${personaldetail.mobileNumber}"></c:out></td>
                            </tr>
                            <tr>
                                <td>Sex</td>
                                <td><c:out value=": ${personaldetail.sex}"></c:out></td>
                            </tr>
                            <tr>
                                <td>Birth Day</td>
                                <td><c:out value=": ${personaldetail.birthDay}"></c:out></td>
                            </tr>
                            <tr>
                                <td>Height</td>
                                <td><c:out value=": ${personaldetail.height}"></c:out></td>
                            </tr>
                            <tr>
                                <td>Weight</td>
                                <td><c:out value=": ${personaldetail.weight}"></c:out></td>
                            </tr>
                            <tr>
                                <td>Blood Group</td>
                                <td><c:out value=": ${personaldetail.bloodGroup}"></c:out></td>
                            </tr>
                        </table>
                    </div>  
                </div>
                <div class="row">

                    <div class="col-md-4 ">
                        <div style="text-align: center;">

                            <br>
                        </div>

                    </div>  
                    <div  class="col-md-6">
                        <p class="headertag" >Registration Information</p><br><br><br>
                        <table class="table myprop">
                            <tr>
                                <td>Registration Number</td>
                                <td><c:out value=": ${registration.regNo}"></c:out></td>
                            </tr>
                            <tr>
                                <td>Registration Day</td>
                                <td><c:out value=": ${registration.day}"></c:out></td>
                                </td>
                            <tr>
                                <td>vehicle </td>
                                <td><c:out value=": ${registration.drivingLicenceClasses}"></c:out></td>
                            </tr>
                        </table>
                    </div>  
                </div>
                <div class="row">

                    <div class="col-md-4 ">
                        <div style="text-align: center;">

                            <br>
                        </div>

                    </div>  
                    <div  class="col-md-6">
                        <p class="headertag" >Course Fee Details</p><br><br><br>
                        <table class="table myprop">
                            <tr>
                                <td>Registration Number</td>
                                <td><c:out value=": ${account.accountNumberA}"></c:out></td>
                            </tr>
                            <tr>
                                <td>Registration Day</td>
                                <td><c:out value=": Rs. ${account.fullAmount}"></c:out></td>
                            </tr>

                        </table>
                        <br>
                        <br>
                        <br>
                        <br>
                        <div  class="col-md-12">
                            <p class="headertag" >Exam Detail</p><br><br><br>
                            <table class="table myprop">
                                <tr>
                                    <td>Registration Number</td>
                                    <td><c:out value=": ${exam.mark}"></c:out></td>
                                </tr>
                                <tr>
                                    <td>Registration Day</td>
                                    <td><c:out value=": ${exam.date}"></c:out></td>
                            </tr>

                        </table>
                    </div>  
                </div>  

            </div>
        </div>
    </body>
</html>
