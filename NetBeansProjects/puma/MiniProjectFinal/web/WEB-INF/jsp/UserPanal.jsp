<%-- 
    Document   : AdminPanal
    Created on : Aug 6, 2016, 5:56:15 PM
    Author     : Thamira
--%>

<%@page import="java.util.Collection"%>
<%@page import="com.sumaga.learnerssystem.dto.Personalaccount"%>
<%@page import="com.sumaga.learnerssystem.dto.Account"%>
<%@page import="com.sumaga.learnerssystem.dto.Personaldetail"%>
<%@page import="com.sumaga.learnerssystem.dto.Registrationdetails"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <!-- Tell the browser to be responsive to screen width -->
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <!-- Bootstrap 3.3.6 -->
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <!-- Font Awesome -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
        <!-- Ionicons -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
        <!-- jvectormap -->
        <!--<link rel="stylesheet" href="plugins/jvectormap/jquery-jvectormap-1.2.2.css">-->
        <!-- Theme style -->
        <link rel="stylesheet" href="dist/css/AdminLTE.min.css">
        <!-- AdminLTE Skins. Choose a skin from the css/skins
             folder instead of downloading all of them to reduce the load. -->
        <link rel="stylesheet" href="dist/css/skins/_all-skins.min.css">

        <!-- DataTables -->
        <link rel="stylesheet" href="plugins/datatables/dataTables.bootstrap.css">
        <!-- daterange picker -->
        <link rel="stylesheet" href="plugins/daterangepicker/daterangepicker.css">
        <!-- bootstrap datepicker -->
        <link rel="stylesheet" href="plugins/datepicker/datepicker3.css">
        <!-- iCheck for checkboxes and radio inputs -->
        <link rel="stylesheet" href="plugins/iCheck/all.css">
        <!-- Bootstrap Color Picker -->
        <link rel="stylesheet" href="plugins/colorpicker/bootstrap-colorpicker.min.css">
        <!-- Bootstrap time Picker -->
        <link rel="stylesheet" href="plugins/timepicker/bootstrap-timepicker.min.css">
    </head>
    <body class="hold-transition skin-blue sidebar-mini">
        <div class="wrapper">

            <header class="main-header">
                <!-- Logo -->
                <a href="index2.html" class="logo">
                    <!-- mini logo for sidebar mini 50x50 pixels -->
                    <span class="logo-mini"><b>S</b>L</span>
                    <!-- logo for regular state and mobile devices -->
                    <span class="logo-lg"><b>Sumaga</b>Lerners</span>
                </a>
                <!-- Header Navbar: style can be found in header.less -->
                <nav class="navbar navbar-static-top">
                    <!-- Sidebar toggle button-->
                    <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
                        <span class="sr-only">Toggle navigation</span>
                    </a>

                    <div class="navbar-custom-menu">
                        <ul class="nav navbar-nav">

                            <li class="dropdown user user-menu">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                    <img src="dist/img/user2-160x160.jpg" class="user-image" alt="User Image">
                                    <span class="hidden-xs">Thamira Lakmal</span>
                                </a>
                                <ul class="dropdown-menu">
                                    <!--User image--> 
                                    <li class="user-header">
                                        <img src="dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">


                                    </li>

                                    <li class="user-footer">
                                        <div class="pull-left">
                                            <a href="#" class="btn btn-default btn-flat">Profile</a>
                                        </div>
                                        <div class="pull-right">
                                            <a href="index.jsp" class="btn btn-default btn-flat">Sign out</a>
                                        </div>
                                    </li>
                                </ul>
                            </li>
                            <!--Control Sidebar Toggle Button--> 
                            <li>
                                <a href="#" data-toggle="control-sidebar"><i class="fa fa-gears"></i></a>
                            </li>
                        </ul>
                    </div>
                </nav>
            </header>




            <div class="content-wrapper">

                <section class="content-header">
                    <h1>
                        Welcome
                        <small>sumaga</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li class="active">Dashboard</li>
                    </ol>
                </section>
                <%
                    Registrationdetails person = (Registrationdetails) session.getAttribute("registration");
                    Personaldetail p = person.getNic();
                    Account ac = person.getAccount();
                    Double ammount = ac.getFullAmount();
                    Collection<Personalaccount> personalaccountCollection = ac.getPersonalaccountCollection();
                    for (Personalaccount personalaccount : personalaccountCollection) {
                        ammount -= personalaccount.getAmount();
                    }

                %>

                <section class="content">

                    <div class="row" >
                        <div id="mainbody">

                        </div>

                        <section class="col-lg-7 connectedSortable" >

                            <div id="addperson">

                                <%="<div class=\"box box-primary\">\n"
                                        + "            <div class=\"box-body box-danger\">\n"
                                        + "                <img class=\"profile-user-img img-responsive img-circle\" src=\"dist/img/user4-128x128.jpg\" alt=\"User profile picture\">\n"
                                        + "\n"
                                        + "                <h3 class=\"profile-username text-center\">" + p.getShortName() + "</h3>\n"
                                        + "\n"
                                        + "                <p class=\"text-muted text-center\">" + p.getAddress() + "</p>\n"
                                        + "\n"
                                        + "                <ul class=\"list-group list-group-unbordered\">\n"
                                        + "                    <li class=\"list-group-item\">\n"
                                        + "                        <b>NIC</b> <a class=\"pull-right\">" + p.getNic() + "</a>\n"
                                        + "                    </li>\n"
                                        + "                    <li class=\"list-group-item\">\n"
                                        + "                        <b>Full Name</b> <a class=\"pull-right\">" + p.getFullName() + "</a>\n"
                                        + "                    </li>\n"
                                        + "                    <li class=\"list-group-item\">\n"
                                        + "                        <b>Mobile Number</b> <a class=\"pull-right\">" + p.getMobileNumber() + "</a>\n"
                                        + "                    </li>\n"
                                        + "                    <li class=\"list-group-item\">\n"
                                        + "                        <b>Date of Birth</b> <a class=\"pull-right\">" + p.getBirthDay() + "</a>\n"
                                        + "                    </li>\n"
                                        + "                    <li class=\"list-group-item\">\n"
                                        + "                        <b>Age</b> <a class=\"pull-right\">" + p.getAge() + "</a>\n"
                                        + "                    </li>\n"
                                        + "                    <li class=\"list-group-item\">\n"
                                        + "                        <b>Sex</b> <a class=\"pull-right\">" + p.getSex() + "</a>\n"
                                        + "                    </li>\n"
                                        + "                    <li class=\"list-group-item\">\n"
                                        + "                        <b>Height</b> <a class=\"pull-right\">" + p.getHeight() + "</a>\n"
                                        + "                    </li>\n"
                                        + "                    <li class=\"list-group-item\">\n"
                                        + "                        <b>Weight</b> <a class=\"pull-right\">" + p.getWeight() + "</a>\n"
                                        + "                    </li>\n"
                                        + "                    <li class=\"list-group-item\">\n"
                                        + "                        <b>Blood Group</b> <a class=\"pull-right\">" + p.getBloodGroup() + "</a>\n"
                                        + "                    </li>\n"
                                        + "</ul>\n<div class=\"row\">\n"
                                        + "                </div>"%>

                            </div>


                        </section>

                        <section class="col-lg-5 ">


                            <div id="addperson" class="connectedSortable">

                                <%="<div class=\"box box-primary\">\n"
                                        + "            <div class=\"box-body box-danger\">\n"
                                        + "                <ul class=\"list-group list-group-unbordered\">\n"
                                        + "                    <li class=\"list-group-item\">\n"
                                        + "                        <b>Full Amount of Course</b> <a class=\"pull-right\">" + ac.getFullAmount() + "</a>\n"
                                        + "                    </li>\n"
                                        + "                    <li class=\"list-group-item\">\n"
                                        + "                        <b>Balanse Ammount</b> <a class=\"pull-right\">" + ammount + "</a>\n"
                                        + "                    </li>\n"
                                        + "</ul>\n<div class=\"row\">\n"
                                        + "                </div>"%>

                            </div>
                            <br><br>          

                            <div id="addperson" class="connectedSortable">

                                <%="<div class=\"box box-primary\">\n"
                                        + "            <div class=\"box-body box-danger\">\n"
                                        + "                <ul class=\"list-group list-group-unbordered\">\n"
                                        + "                    <li class=\"list-group-item\">\n"
                                        + "                        <b>Reg</b> <a class=\"pull-right\">" + person.getRegNo() + "</a>\n"
                                        + "                    </li>\n"
                                        + "                    <li class=\"list-group-item\">\n"
                                        + "                        <b>Driving Classes</b> <a class=\"pull-right\">" + person.getDrivingLicenceClasses() + "</a>\n"
                                        + "                    </li>\n"
                                        + "</ul>\n<div class=\"row\">\n"
                                        + "                </div>"%>

                            </div>

                        </section>
                        <section class="col-lg-5 ">


                            <div id="addperson" class="connectedSortable">
                                <div class="box box-primary">
                                    <div class="box-header">
                                        Exam Detail
                                    </div>

                                    <%="           <div class=\"box-body box-danger\">\n"
                                            + "                <ul class=\"list-group list-group-unbordered\">\n"
                                            + "                    <li class=\"list-group-item\">\n"
                                            + "                        <b>Results</b> <a class=\"pull-right\">" + person.getExam().getMark() + "</a>\n"
                                            + "                    </li>\n"
                                            + "</ul>\n<div class=\"row\">\n"
                                            + "                </div>"%>

                                </div>
                                <br><br>          



                                </section>

                            </div>




                        </section>

                    </div>

                    <footer class="main-footer">
                        <div class="pull-right hidden-xs">
                            <b>Version</b> 1.1.0
                        </div>
                        <strong>Copyright &copy; 2016<a href="http://almsaeedstudio.com"> Thamira Lakmal</a>.</strong> All rights

                    </footer>


                    <aside class="control-sidebar control-sidebar-dark">

                        <ul class="nav nav-tabs nav-justified control-sidebar-tabs">
                            <li><a href="#control-sidebar-home-tab" data-toggle="tab"><i class="fa fa-home"></i></a></li>
                            <li><a href="#control-sidebar-settings-tab" data-toggle="tab"><i class="fa fa-gears"></i></a></li>
                        </ul>

                        <div class="tab-content">

                            <div class="tab-pane" id="control-sidebar-home-tab">
                                <h3 class="control-sidebar-heading">Recent Activity</h3>
                                <ul class="control-sidebar-menu">
                                    <li>
                                        <a href="javascript:void(0)">
                                            <i class="menu-icon fa fa-birthday-cake bg-red"></i>

                                            <div class="menu-info">
                                                <h4 class="control-sidebar-subheading">Langdon's Birthday</h4>

                                                <p>Will be 23 on April 24th</p>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="javascript:void(0)">
                                            <i class="menu-icon fa fa-user bg-yellow"></i>

                                            <div class="menu-info">
                                                <h4 class="control-sidebar-subheading">Frodo Updated His Profile</h4>

                                                <p>New phone +1(800)555-1234</p>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="javascript:void(0)">
                                            <i class="menu-icon fa fa-envelope-o bg-light-blue"></i>

                                            <div class="menu-info">
                                                <h4 class="control-sidebar-subheading">Nora Joined Mailing List</h4>

                                                <p>nora@example.com</p>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="javascript:void(0)">
                                            <i class="menu-icon fa fa-file-code-o bg-green"></i>

                                            <div class="menu-info">
                                                <h4 class="control-sidebar-subheading">Cron Job 254 Executed</h4>

                                                <p>Execution time 5 seconds</p>
                                            </div>
                                        </a>
                                    </li>
                                </ul>


                                <h3 class="control-sidebar-heading">Tasks Progress</h3>
                                <ul class="control-sidebar-menu">
                                    <li>
                                        <a href="javascript:void(0)">
                                            <h4 class="control-sidebar-subheading">

                                                <span class="label label-danger pull-right">70%</span>
                                            </h4>

                                            <div class="progress progress-xxs">
                                                <div class="progress-bar progress-bar-danger" style="width: 70%"></div>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="javascript:void(0)">
                                            <h4 class="control-sidebar-subheading">

                                                <span class="label label-success pull-right">95%</span>
                                            </h4>

                                            <div class="progress progress-xxs">
                                                <div class="progress-bar progress-bar-success" style="width: 95%"></div>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="javascript:void(0)">
                                            <h4 class="control-sidebar-subheading">

                                                <span class="label label-warning pull-right">50%</span>
                                            </h4>

                                            <div class="progress progress-xxs">
                                                <div class="progress-bar progress-bar-warning" style="width: 50%"></div>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="javascript:void(0)">
                                            <h4 class="control-sidebar-subheading">

                                                <span class="label label-primary pull-right">68%</span>
                                            </h4>

                                            <div class="progress progress-xxs">
                                                <div class="progress-bar progress-bar-primary" style="width: 68%"></div>
                                            </div>
                                        </a>
                                    </li>
                                </ul>


                            </div>

                            <div class="tab-pane" id="control-sidebar-stats-tab">Stats Tab Content</div>

                            <div class="tab-pane" id="control-sidebar-settings-tab">
                                <form method="post">
                                    <h3 class="control-sidebar-heading">General Settings</h3>

                                    <div class="form-group">
                                        <label class="control-sidebar-subheading">

                                            <input type="checkbox" class="pull-right" checked>
                                        </label>

                                        <p>

                                        </p>
                                    </div>


                                    <div class="form-group">
                                        <label class="control-sidebar-subheading">

                                            <input type="checkbox" class="pull-right" checked>
                                        </label>

                                        <p>

                                        </p>
                                    </div>


                                    <div class="form-group">
                                        <label class="control-sidebar-subheading">

                                            <input type="checkbox" class="pull-right" checked>
                                        </label>

                                        <p>

                                        </p>
                                    </div>


                                    <h3 class="control-sidebar-heading">Chat Settings</h3>

                                    <div class="form-group">
                                        <label class="control-sidebar-subheading">

                                            <input type="checkbox" class="pull-right" checked>
                                        </label>
                                    </div>


                                    <div class="form-group">
                                        <label class="control-sidebar-subheading">

                                            <input type="checkbox" class="pull-right">
                                        </label>
                                    </div>


                                    <div class="form-group">
                                        <label class="control-sidebar-subheading">                                 
                                            <a href="javascript:void(0)" class="text-red pull-right"><i class="fa fa-trash-o"></i></a>
                                        </label>
                                    </div>

                                </form>
                            </div>

                        </div>
                    </aside>

                    <div class="control-sidebar-bg"></div>
            </div>

            <script src="plugins/jQuery/jquery-2.2.3.min.js"></script>

            <!-- Bootstrap 3.3.6 -->
            <script src="bootstrap/js/bootstrap.min.js"></script>

            <!-- FastClick -->
            <script src="plugins/fastclick/fastclick.js"></script>

            <!-- AdminLTE App -->
            <script src="dist/js/app.min.js"></script>

            <!-- SlimScroll 1.3.0 -->
            <script src="plugins/slimScroll/jquery.slimscroll.min.js"></script>

            <script src="plugins/select2/select2.full.min.js"></script>    

            <!-- InputMask -->
            <script src="plugins/input-mask/jquery.inputmask.js"></script>
            <script src="plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
            <script src="plugins/input-mask/jquery.inputmask.extensions.js"></script>
            <!-- date-range-picker -->
            <script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.11.2/moment.min.js"></script>
            <script src="plugins/daterangepicker/daterangepicker.js"></script>
            <!-- bootstrap datepicker -->
            <script src="plugins/datepicker/bootstrap-datepicker.js"></script>
            <!-- bootstrap color picker -->
            <script src="plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
            <!-- bootstrap time picker -->
            <script src="plugins/timepicker/bootstrap-timepicker.min.js"></script>
            <script src="plugins/datatables/jquery.dataTables.min.js"></script>
            <script src="plugins/datatables/dataTables.bootstrap.min.js"></script>

            <script>
                (function () {
                    $('#add_profile').on('click', function (e) {
                        e.preventDefault();
                        $('#mainbody').empty();
                        $('#addperson').load("addperson");
                    });
                    $('#view_profile').on('click', function (e) {
                        e.preventDefault();
                        $('#mainbody').empty();
                        $('#addperson').load("searchPerson");
                    });
                    $('#List_of_People').on('click', function (e) {
                        e.preventDefault();
                        $('#mainbody').load("allpersonpage");
                        $('#addperson').empty();
                        $('#viewperson').empty();
                    });
                    $('#registration_person').on('click', function (e) {
                        e.preventDefault();
                        $('#mainbody').empty();
                        $('#addperson').load('newregistration');
                        $('#viewperson').empty();
                    });
                    $('#registration_search').on('click', function (e) {
                        e.preventDefault();
                        $('#mainbody').empty();
                        $('#addperson').load("searchRegistration");
                    });
                    $('#addAccount').on('click', function (e) {
                        e.preventDefault();
                        $('#mainbody').empty();
                        $('#addperson').load("loadSearch");
                    });
                    $('#addAccountQuart').on('click', function (e) {
                        e.preventDefault();
                        $('#mainbody').empty();
                        $('#addperson').load("addAcountQuart");
                    });
                    $('#examList').on('click', function (e) {
                        e.preventDefault();
                        $('#mainbody').empty();
                        $('#addperson').load("getRegNoBNotGoToExam");
                    });
                    $('#examresult').on('click', function (e) {
                        e.preventDefault();
                        $('#mainbody').empty();
                        $('#addperson').load("addMaekForExam");
                    });
                })();
            </script>







    </body>
</html>
