<%-- 
    Document   : AdminPanal
    Created on : Aug 6, 2016, 5:56:15 PM
    Author     : Thamira
--%>

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

            <aside class="main-sidebar">

                <section class="sidebar">

                   
                    <form action="#" method="get" class="sidebar-form">
                        <div class="input-group">
                            <input type="text" name="q" class="form-control" placeholder="Search...">
                            <span class="input-group-btn">
                                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                                </button>
                            </span>
                        </div>
                    </form>

                    <ul class="sidebar-menu">
                        <li class="header">Manage Coustomers</li>
                        <li class=" treeview">
                            <a >
                                <i class="fa fa-user-md"></i> <span>Manage Profile</span>
                                <span class="pull-right-container">
                                    <i class="fa fa-angle-left pull-right"></i>
                                </span>
                            </a>
                            <ul class="treeview-menu">
                                <li class="active"><a id="add_profile"><i class="fa fa-user-plus"></i> Add Profile</a></li>

                                <li ><a id="view_profile"><i class="fa fa-users"></i> View Profile</a></li>
                                <li ><a id="List_of_People"><i class="fa fa-users"></i>List of People</a></li>

                            </ul>
                        </li>
                        <li class=" treeview">
                            <a href="#">
                                <i class="fa fa-user-md"></i> <span>Registration</span>
                                <span class="pull-right-container">
                                    <i class="fa fa-angle-left pull-right"></i>
                                </span>
                            </a>
                            <ul class="treeview-menu">
                                <li id='registration_person' class="active"><a href="index.html"><i class="fa fa-user-plus"></i> New Registration</a></li>
                                <li id='registration_search'><a href="index2.html"><i class="fa fa-user-times"></i> View Registration Detail</a></li>
                                <li ><a href="index2.html"><i class="fa fa-users"></i> View Registration Detail</a></li>

                            </ul>
                        </li>
                        <li class=" treeview">
                            <a href="#">
                                <i class="fa fa-dollar"></i> <span>Account Handle</span>
                                <span class="pull-right-container">
                                    <i class="fa fa-angle-left pull-right"></i>
                                </span>
                            </a>
                            <ul class="treeview-menu">
                                <li id="addAccount" class="active"><a href="index.html"><i class="fa fa-user-plus"></i> New User Account</a></li>
                                <li id="addAccountQuart"><a href="index2.html"><i class="fa fa-user-times"></i> Quart Payment</a></li>
                                <li ><a href="index2.html"><i class="fa fa-users"></i> View Account Detail</a></li>

                            </ul>
                        </li>
                        <li class=" treeview">
                            <a href="#">
                                <i class="fa  fa-book"></i> <span>Exam</span>
                                <span class="pull-right-container">
                                    <i class="fa fa-angle-left pull-right"></i>
                                </span>
                            </a>
                            <ul class="treeview-menu">


                                <li ><a id="examList"><i class="fa fa-user-times"></i> Personal Exam Detail</a></li>
                                <li ><a id='examresult'><i class="fa fa-users"></i> Results </a></li>
                                <li ><a href="index2.html"><i class="fa fa-users"></i> Reminders </a></li>

                            </ul>
                        </li>
                        <li class=" treeview">
                            <a href="#">
                                <i class="fa fa-automobile"></i> <span>Trail</span>
                                <span class="pull-right-container">
                                    <i class="fa fa-angle-left pull-right"></i>
                                </span>
                            </a>
                            <ul class="treeview-menu">


                                <li ><a href="index2.html"><i class="fa fa-user-times"></i> Personal Trail Detail</a></li>
                                <li ><a href="index2.html"><i class="fa fa-users"></i> Results </a></li>
                                <li ><a href="index2.html"><i class="fa fa-users"></i> Reminders </a></li>

                            </ul>
                        </li>
                        <li class="header">Lerners Manage</li>
                        <li class=" treeview">
                            <a href="#">
                                <i class="fa fa-automobile"></i> <span>Allocations</span>
                                <span class="pull-right-container">
                                    <i class="fa fa-angle-left pull-right"></i>
                                </span>
                            </a>
                            <ul class="treeview-menu">
                                <li class="active"><a href="index.html"><i class="fa fa-user-plus"></i> Exam List Allocation</a></li>
                                <li class="active"><a href="index.html"><i class="fa fa-user-plus"></i> Trail List Allocation</a></li>
                                <li ><a href="index2.html"><i class="fa fa-users"></i> Result List </a></li>
                                <li ><a href="index2.html"><i class="fa fa-users"></i> Mark Allocate </a></li>

                            </ul>
                        </li>
                        <li class=" treeview">
                            <a href="#">
                                <i class="fa fa-automobile"></i> <span>Summery</span>
                                <span class="pull-right-container">
                                    <i class="fa fa-angle-left pull-right"></i>
                                </span>
                            </a>
                            <ul class="treeview-menu">
                                <li class="active"><a href="index.html"><i class="fa fa-user-plus"></i>Customer Summery</a></li>
                                <li class="active"><a href="index.html"><i class="fa fa-user-plus"></i> Exam List</a></li>
                                <li ><a href="index2.html"><i class="fa fa-user-times"></i> Account Summery</a></li>
                                <li ><a href="index2.html"><i class="fa fa-users"></i> Trail List </a></li>
                                <li ><a href="index2.html"><i class="fa fa-users"></i> Result List </a></li>

                            </ul>
                        </li>
                        <li class="header">Instructers Daily Recode</li>
                        <li class=" treeview">
                            <a href="#">
                                <i class="fa fa-automobile"></i> <span>Recodes</span>
                                <span class="pull-right-container">
                                    <i class="fa fa-angle-left pull-right"></i>
                                </span>
                            </a>
                            <ul class="treeview-menu">
                                <li class="active"><a href="index.html"><i class="fa fa-user-plus"></i>Day State</a></li>
                                <li class="active"><a href="index.html"><i class="fa fa-user-plus"></i>Customer Summery</a></li>
                                <li ><a href="index2.html"><i class="fa fa-user-times"></i> Allocate Next Day</a></li>
                            </ul>
                        </li>


                    </ul>
                </section>
                <!--/.sidebar--> 
            </aside>


            <div class="content-wrapper">

                <section class="content-header">
                    <h1>
                        Manage Panal
                        <small>sumaga</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li class="active">Dashboard</li>
                    </ol>
                </section>


                <section class="content">

                    <div class="row" >
                        <div id="mainbody">

                        </div>

                        <section class="col-lg-7 connectedSortable" >

                            <div id="addperson">
                                <!-- Calendar -->
                                <div class="box box-solid bg-green-gradient">
                                    <div class="box-header">
                                        <i class="fa fa-calendar"></i>

                                        <h3 class="box-title">Calendar</h3>
                                        <!-- tools box -->
                                        <div class="pull-right box-tools">
                                            <!-- button with a dropdown -->
                                            <div class="btn-group">
                                                <button type="button" class="btn btn-success btn-sm dropdown-toggle" data-toggle="dropdown">
                                                    <i class="fa fa-bars"></i></button>
                                                <ul class="dropdown-menu pull-right" role="menu">
                                                    <li><a href="#">Add new event</a></li>
                                                    <li><a href="#">Clear events</a></li>
                                                    <li class="divider"></li>
                                                    <li><a href="#">View calendar</a></li>
                                                </ul>
                                            </div>
                                            <button type="button" class="btn btn-success btn-sm" data-widget="collapse"><i class="fa fa-minus"></i>
                                            </button>
                                            <button type="button" class="btn btn-success btn-sm" data-widget="remove"><i class="fa fa-times"></i>
                                            </button>
                                        </div>
                                        <!-- /. tools -->
                                    </div>
                                    <!-- /.box-header -->
                                    <div class="box-body no-padding">
                                        <!--The calendar -->
                                        <div id="calendar" style="width: 100%"></div>
                                    </div>
                                    <!-- /.box-body -->
                                    <div class="box-footer text-black">
                                        <div class="row">
                                            <div class="col-sm-6">
                                                <!-- Progress bars -->
                                                <div class="clearfix">
                                                    <span class="pull-left">Task #1</span>
                                                    <small class="pull-right">90%</small>
                                                </div>
                                                <div class="progress xs">
                                                    <div class="progress-bar progress-bar-green" style="width: 90%;"></div>
                                                </div>

                                                <div class="clearfix">
                                                    <span class="pull-left">Task #2</span>
                                                    <small class="pull-right">70%</small>
                                                </div>
                                                <div class="progress xs">
                                                    <div class="progress-bar progress-bar-green" style="width: 70%;"></div>
                                                </div>
                                            </div>
                                            <!-- /.col -->
                                            <div class="col-sm-6">
                                                <div class="clearfix">
                                                    <span class="pull-left">Task #3</span>
                                                    <small class="pull-right">60%</small>
                                                </div>
                                                <div class="progress xs">
                                                    <div class="progress-bar progress-bar-green" style="width: 60%;"></div>
                                                </div>

                                                <div class="clearfix">
                                                    <span class="pull-left">Task #4</span>
                                                    <small class="pull-right">40%</small>
                                                </div>
                                                <div class="progress xs">
                                                    <div class="progress-bar progress-bar-green" style="width: 40%;"></div>
                                                </div>
                                            </div>
                                            <!-- /.col -->
                                        </div>
                                        <!-- /.row -->
                                    </div>
                                </div>
                                <!-- /.box -->


                            </div>

                        </section>

                        <section class="col-lg-5 connectedSortable">


                            <div class="box box-success">
                                <div id="viewperson">
                                    <div class="box-header with-border">
                                        <i class="fa fa-warning"></i>

                                        <h3 class="box-title">Alerts</h3>
                                    </div>
                                    <div class="box-body">
                                        <div class="alert alert-danger alert-dismissible">
                                            <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                            <h4><i class="icon fa fa-check"></i> Alert!</h4>
                                            Success alert preview. This alert is dismissable.
                                        </div>
                                    </div>

                                </div>

                            </div>

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
