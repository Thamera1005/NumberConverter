<%-- 
    Document   : fatetable_1
    Created on : Aug 11, 2016, 2:10:13 PM
    Author     : Thamira
--%>

<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>
<!--<!DOCTYPE html>
<html>
    <head>-->
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <title>AdminLTE 2 | Dashboard</title>
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <!-- Tell the browser to be responsive to screen width -->
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <!--<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">-->
<!--        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">-->
        <link rel="stylesheet" href="plugins/datatables/dataTables.bootstrap.css">
        <!--<link rel="stylesheet" href="dist/css/AdminLTE.min.css">-->
        <link rel="stylesheet" href="dist/css/skins/_all-skins.min.css">


<!--    </head>
    <body >-->
            <section class="content">
                <div class="row">
                    <div class="col-xs-12">
                        <div class="box">
                            <div class="box-header">
                                <h3 class="box-title">Hover Data Table</h3>
                            </div>
                            <!-- /.box-header -->
                            <div class="box-body">
                                <table id="example2" class="table table-bordered table-hover">
                                    <thead>
                                        <tr>
                                            <th>Nic Number</th>
                                            <th>Full Name</th>
                                            <th>Mobile Number</th>
                                            <th>Address</th>
                                        </tr>
                                    </thead>
                                    <tbody>

                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        

        <script src="plugins/jQuery/jquery-2.2.3.min.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <script src="plugins/datatables/jquery.dataTables.min.js"></script>
        <script src="plugins/datatables/dataTables.bootstrap.min.js"></script>
        <script src="plugins/slimScroll/jquery.slimscroll.min.js"></script>
        <script src="plugins/fastclick/fastclick.js"></script>
        <script src="dist/js/app.min.js"></script>
        <script src="dist/js/demo.js"></script>
        <script>
            $(function () {

                $.ajax({
                    type: 'GET',
                    url: 'allperson',
                    "async": true,
                    success: function (callback) {


                        $("#example2").DataTable({
                            "aaData": callback,
                            "aoColumns": [
                                {"mDataProp": "nic"},
                                {"mDataProp": "fullName"},
                                {"mDataProp": "mobileNumber"},
                                {"mDataProp": "address"}
                            ]


                        });

                    },
                    error: function () {
                        $(this).html("Error!");
                    }
                });


            });
        </script>
<!--    </body>
</html>-->

