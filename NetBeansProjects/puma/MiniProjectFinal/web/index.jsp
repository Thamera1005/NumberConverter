<%-- 
    Document   : index
    Created on : Aug 29, 2016, 6:24:19 PM
    Author     : Thamira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
        <link rel="stylesheet" href="dist/css/AdminLTE.min.css">
        <link rel="stylesheet" href="dist/css/skins/_all-skins.min.css">
        <link rel="stylesheet" href="plugins/iCheck/all.css">
        <link href='https://fonts.googleapis.com/css?family=Arvo' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
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
        <style type="text/css">
            .HeadersFont{
                text-align: center;
                font-family: 'Arvo', serif;
                font-size: 40px;
                color: #265a88;
            }
            .Roadsignal{
                margin: 15px;
                padding: 30px;

                border: 1px solid #ada6a6;
            }
            .coursees{
                margin: 15px;
                padding: 30px;

                border: 1px solid #ada6a6;
                background-color: #b92c28;
            }
            .Facility{
                margin: 15px;
                padding: 30px;

                border: 1px solid #ada6a6;
                background-color: #5bc0de;
            }
            .bottom{

                height: 100px;
            }
        </style>
    </head>  
    <jsp:include page="hedder.jsp"></jsp:include>
    <jsp:include page="slider.jsp"/>  

    <div class="row coursees">
        <section class="col-lg-6">
            <div class="box box-success ">
                <div class="box-header with-border">
                    <p  id="course" class="HeadersFont" >Course Details </p><br>
                </div>
                <div class="box-body with-border">

                    <div class="item-page">
                        <p class="MsoNormal" style="margin-top: 12px; margin-bottom: 12px; padding-left: 120px; text-align: left;"><span style="font-size: 16px;" lang="EN-US">We are giving full training for the following vehicle categories.</span></p>
                        <p class="MsoNormal" style="margin-top: 12px; margin-bottom: 12px; padding-left: 120px; text-align: left;"><span style="font-size: 16px;" lang="EN-US">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; -Motor cycles&nbsp;&nbsp;&nbsp; [A, A1]</span></p>
                        <p class="MsoNormal" style="margin-top: 12px; margin-bottom: 12px; padding-left: 120px; text-align: left;"><span style="font-size: 16px;" lang="EN-US">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; -Three Wheel&nbsp;&nbsp;&nbsp; [B1]</span></p>
                        <p class="MsoNormal" style="margin-top: 12px; margin-bottom: 12px; padding-left: 120px; text-align: left;"><span style="font-size: 16px;" lang="EN-US">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; -Light Vehicles (dual purpose)&nbsp;&nbsp;&nbsp; [B]</span></p>
                        <p class="MsoNormal" style="margin-top: 12px; margin-bottom: 12px; padding-left: 120px; text-align: left;"><span style="font-size: 16px;" lang="EN-US">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; -Heavy vehicles</span></p>
                        <p class="MsoNormal" style="margin-top: 12px; margin-bottom: 12px; padding-left: 120px; text-align: left;"><span style="font-size: 16px;" lang="EN-US">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; -Prime movers</span></p>
                        <p class="MsoNormal" style="margin-top: 12px; margin-bottom: 12px; padding-left: 120px; text-align: left;"><strong><span style="font-size: 22px;" lang="EN-US">Course packages</span></strong></p>
                        <p class="MsoListParagraphCxSpFirst" style="margin-top: 12px; margin-bottom: 12px; padding-left: 180px; text-indent: -18pt; text-align: left;"><span style="font-size: 16px;"><span lang="EN-US">1.&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span lang="EN-US">Motor cycles + Light vehicles</span></span></p>
                        <p class="MsoListParagraphCxSpMiddle" style="margin-top: 12px; margin-bottom: 12px; padding-left: 180px; text-indent: -18pt; text-align: left;"><span style="font-size: 16px;"><span lang="EN-US">2.&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span lang="EN-US">Motor cycles + Light vehicles + Three wheelers</span></span></p>
                        <p class="MsoListParagraphCxSpMiddle" style="margin-top: 12px; margin-bottom: 12px; padding-left: 180px; text-indent: -18pt; text-align: left;"><span style="font-size: 16px;"><span lang="EN-US">3.&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span lang="EN-US">Heavy vehicles</span></span></p>
                        <p class="MsoListParagraphCxSpLast" style="margin-top: 12px; margin-bottom: 12px; padding-left: 180px; text-indent: -18pt; text-align: left;"><span style="font-size: 16px;"><span lang="EN-US">4.&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span lang="EN-US">Prime movers</span></span></p>
                        <p class="MsoListParagraphCxSpLast" style="margin-top: 12px; margin-bottom: 12px; padding-left: 180px; text-indent: -18pt; text-align: left;">&nbsp;</p>
                        <p class="MsoListParagraphCxSpFirst" style="margin-top: 12px; margin-bottom: 12px; padding-left: 120px; text-indent: -18pt; text-align: left;"><span style="font-family: Symbol; font-size: 16px;">·</span><span style="font-size: 16px;"><span style="font-family: Verdana;">&nbsp;<strong><span style="line-height: 18px; font-weight: normal;" lang="EN-US">This course is mainly for Beginners</span></strong></span></span></p>
                        <p class="MsoListParagraphCxSpMiddle" style="margin-top: 12px; margin-bottom: 12px; padding-left: 120px; text-indent: -18pt; text-align: left;"><span style="font-size: 16px;"><span style="font-family: Symbol;" lang="EN-US">·&nbsp;</span><span lang="EN-US">You can use appointed times within office hours including weekends for your training.</span></span></p>
                        <p class="MsoListParagraphCxSpMiddle" style="margin-top: 12px; margin-bottom: 12px; padding-left: 120px; text-indent: -18pt; text-align: left;"><span style="font-size: 16px;"><span style="font-family: Symbol;" lang="EN-US">·&nbsp;</span><span lang="EN-US">Dual purpose (cars, van etc.) driving training in a vehicle provided by us or, in your own vehicle according to the students wish.</span></span></p>
                        <p class="MsoListParagraphCxSpMiddle" style="margin-top: 12px; margin-bottom: 12px; padding-left: 120px; text-indent: -18pt; text-align: left;"><span style="font-size: 16px;"><span style="font-family: Symbol;" lang="EN-US">·&nbsp;</span><span lang="EN-US">Training will be up to the license standards.</span></span></p>
                        <p class="MsoListParagraphCxSpMiddle" style="margin-top: 12px; margin-bottom: 12px; padding-left: 120px; text-indent: -18pt; text-align: left;"><span style="font-size: 16px;"><span style="font-family: Symbol;" lang="EN-US">·&nbsp;</span><span lang="EN-US">Train by professionally qualified instructors.</span></span></p>
                        <p class="MsoListParagraphCxSpMiddle" style="margin-top: 12px; margin-bottom: 12px; padding-left: 120px; text-indent: -18pt; text-align: left;"><span style="font-size: 16px;"><span style="font-family: Symbol;" lang="EN-US">·&nbsp;</span><span lang="EN-US">Special attention on security and safety of ladies.</span></span></p>
                        <p class="MsoListParagraphCxSpLast" style="margin-top: 12px; margin-bottom: 12px; padding-left: 120px; text-indent: -18pt; text-align: left;"><span style="font-size: 16px;"><span style="font-family: Symbol;" lang="EN-US">·&nbsp;</span><span lang="EN-US">We will also be assisting you on applying for the driving license theory exam and practical exam as well.</span></span></p>
                        <p class="MsoListParagraphCxSpLast" style="margin-top: 12px; margin-bottom: 12px; padding-left: 140px; text-indent: -18pt; text-align: left;"><strong>&nbsp;</strong></p>
                        <p class="MsoListParagraphCxSpLast" style="margin-top: 12px; margin-bottom: 12px; padding-left: 140px; text-indent: -18pt; text-align: left;"><strong><span style="font-size: 22px;" lang="EN-US">Course contents</span></strong></p>
                        <p class="MsoListParagraphCxSpFirst" style="margin-top: 12px; margin-bottom: 12px; padding-left: 120px; text-indent: -18pt; text-align: left;"><span style="font-size: 16px;"><span style="font-family: Symbol;" lang="EN-US">·&nbsp;</span><span lang="EN-US">Giving basic theory knowledge about road rules.</span></span></p>
                        <p class="MsoListParagraphCxSpMiddle" style="margin-top: 12px; margin-bottom: 12px; padding-left: 120px; text-indent: -18pt; text-align: left;"><span style="font-size: 16px;"><span style="font-family: Symbol;" lang="EN-US">·&nbsp;</span><span lang="EN-US">Simulator training.</span></span></p>
                        <p class="MsoListParagraphCxSpMiddle" style="margin-top: 12px; margin-bottom: 12px; padding-left: 120px; text-indent: -18pt; text-align: left;"><span style="font-size: 16px;"><span style="font-family: Symbol;" lang="EN-US">·&nbsp;</span><span lang="EN-US">Training in our own yard.</span></span></p>
                        <p class="MsoListParagraphCxSpMiddle" style="margin-top: 12px; margin-bottom: 12px; padding-left: 120px; text-indent: -18pt; text-align: left;"><span style="font-size: 16px;"><span style="font-family: Symbol;" lang="EN-US">·&nbsp;</span><span lang="EN-US">Training in the road.</span></span></p>
                        <p class="MsoListParagraphCxSpLast" style="margin-top: 12px; margin-bottom: 12px; padding-left: 120px; text-indent: -18pt; text-align: left;"><span style="font-size: 16px;"><span style="font-family: Symbol;" lang="EN-US">·&nbsp;</span><span lang="EN-US">Training in the common yard. (The same yard which use for practical test)</span></span></p>
                        <p>&nbsp;</p>
                        <p>&nbsp;</p>
                        <p>&nbsp;</p> </div></div> 
            </div>

        </section>
        <section class="col-lg-5 course">
            <div class="box box-success">
                <!-- DONUT CHART -->
                <div class="box box-danger">
                    <div class="box-header with-border">
                        <h3 class="box-title">Donut Chart</h3>

                        <div class="box-tools pull-right">
                            <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                            </button>
                            <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>
                        </div>
                    </div>
                    <div class="box-body">
                        <canvas id="pieChart" style="height:250px"></canvas>
                    </div>
                    <!-- /.box-body -->
                </div>
            </div>
            <div class="box box-success">
                <div class="box-header with-border">
                    <p id="facility"class="HeadersFont">Facility We have </p><br>
                </div>
                <div class="box-body">

                    <div class="item-page">
                        <p>·  Giving lectures using new multimedia technology. Availability of comfortable class rooms and favorable learning environment.</p><br>
                        <p>·  Issuing a booklet with all instructions included.</p><br>
                        <p>·  Driving training in our own yards.</p><br>
                        <p>·  Availability of VIP courses.</p><br>
                        <p>·  We are conducting workshops in every Sundays. Anyone can join with those workshops because it is totally free for everyone. (We will discuss about road signs & disciplines which specially target on writing test.)</p><br>
                        <p>·  Giving the basic technical knowledge about vehicles.</p><br>
                        <p>·  Simulator training.</p><br>
                        <p>·  Road training with qualified instructors.</p><br>
                        <p>·  We offer you the facility of taking driving license, through an oral test without facing a writing test.(For the people who haven't the knowledge of reading and writing)</p><br>
                        <p>·  Availability of Co-operate packages. (For groups more than 5 members.)</p><br>
                        <p>·  Special attention on security and safety of ladies.</p><br>

                    </div>
                </div>
            </div>
        </section>
    </div>

    <div class="container-fluid Facility">
        <section class="col-lg-12 facility">
            <div class="box box-success">
                <div class="box-header">

                </div>
                <div class="box-body">
                    <jsp:include page="RoadSignal.jsp"></jsp:include> 

                </div>
            </div>
        </section>


    </div>

    <script src="plugins/jQuery/jquery-2.2.3.min.js"></script>


    <script src="bootstrap/js/bootstrap.min.js"></script>

    <script src="plugins/fastclick/fastclick.js"></script>

    <script src="dist/js/app.min.js"></script>

    <script src="plugins/slimScroll/jquery.slimscroll.min.js"></script>

    <script src="plugins/select2/select2.full.min.js"></script>    


</body>
</html>
