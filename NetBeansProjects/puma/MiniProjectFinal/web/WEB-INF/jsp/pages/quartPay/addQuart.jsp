

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
<!-- Ionicons -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
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
<!-- Select2 -->
<link rel="stylesheet" href="plugins/select2/select2.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="dist/css/AdminLTE.min.css">
<!-- AdminLTE Skins. Choose a skin from the css/skins
     folder instead of downloading all of them to reduce the load. -->
<link rel="stylesheet" href="dist/css/skins/_all-skins.min.css">


<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div class="box box-primary"> 
    <form:form method="POST"  action="accountBAddtoDb" modelAttribute="account">
        <div class="box-header with-border">
            <i class="ion ion-clipboard"></i>
            <h3 class="box-title">Add New Profile</h3>
        </div>

        <div class="form-horizontal">



            <div class="box-body"><br>
                <div class="form-group">
                    <label for="inputEmail3" class="pull-left col-sm-3">Account Number</label>

                    <div class="col-sm-9">
                        <form:input path="accountNumberB" class="form-control" data-inputmask="'mask': ['999999999V']" data-mask=""/>

                    </div>
                </div>


                <div class="form-group">
                    <label class=" col-sm-3 ">Date</label>
                    <div class="col-sm-9">
                        <div class="input-group date ">
                            <div class="input-group-addon">
                                <i class="fa fa-calendar"></i>
                            </div>
                            <form:input path="date" class="form-control pull-right" id="datepicker" />
                        </div>
                    </div>
                    <!-- /.input group -->
                </div>

                <div class="form-group">
                    <label for="inputEmail3" class="pull-left col-sm-3">Quarts Amount</label>

                    <div class="col-sm-9">
                        <form:input path="amount" class="form-control" placeholder="Enter User Name."/>
                    </div>
                </div>



<!--                <div class="form-group">
                    <label for="inputEmail3" class="pull-left col-sm-3">Account Number A</label>

                    <div class="col-sm-9">
                        <form:hidden path="accountNumberA" class="form-control" id="inputEmail3" placeholder="Enter Address"/>
                    </div>
                </div>-->
            </div>

        </div>
        <!--/.box-body--> 
        <div class="box-footer">
            <button  type="submit" class="btn btn-primary">Submit</button>

        </div>
    </form:form>





</div>



<script src="js/main.js"></script>

<script>
    (function () {
        $('#account').submit(function (e) {

            var frm = $('#account');
            e.preventDefault();

            var data = {}
            var Form = this;

            //Gather Data also remove undefined keys(buttons)
            $.each(this, function (i, v) {
                var input = $(v);
                data[input.attr("name")] = input.val();
                delete data["undefined"];
            });
            $.ajax({
                contentType: 'application/json; charset=utf-8',
                type: 'POST',
                url: 'accountBAddtoDb',
                dataType: 'json',
                data: JSON.stringify(data),
                success: function (callback) {
                    if (callback["nic"] == "duplicate") {
                        $('#viewperson').append("<div class=\"box-body\">\n" +
                                "                                        <div class=\"alert alert-success alert-danger\">\n" +
                                "                                            <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">&times;</button>\n" +
                                "                                            <h4><i class=\"icon fa fa-check\"></i> Duplicate NIC please check!</h4>\n" +
                                "                                            nic: " + callback["nic"] + " name:" + callback["shortName"] + "\n" +
                                "                                        </div>\n" +
                                "                                    </div>");
                    } else if (callback["nic"] == "null") {
                        $('#viewperson').append("<div class=\"box-body\">\n" +
                                "                                        <div class=\"alert alert-danger alert-dismissible\">\n" +
                                "                                            <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">&times;</button>\n" +
                                "                                            <h4><i class=\"icon fa fa-check\"></i> Please enter Nic!</h4>\n" +
                                "                                            nic: " + callback["nic"] + " name:" + callback["shortName"] + "\n" +
                                "                                        </div>\n" +
                                "                                    </div>");
                    } else {
                        $('#viewperson').append("<div class=\"box-body\">\n" +
                                "                                        <div class=\"alert alert-success alert-dismissible\">\n" +
                                "                                            <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">&times;</button>\n" +
                                "                                            <h4><i class=\"icon fa fa-check\"></i> Successful!</h4>\n" +
                                "                                            nic: " + callback["nic"] + " name:" + callback["shortName"] + "\n" +
                                "                                        </div>\n" +
                                "                                    </div>");
                    }
                },
                error: function () {
                    $(this).html("Error!");
                }
            });
        });

    })();
</script>

<script>
    $(function () {
        //Initialize Select2 Elements
        $(".select2").select2();
        //Datemask dd/mm/yyyy
        $("#datemask").inputmask("dd/mm/yyyy", {"placeholder": "dd/mm/yyyy"});
        //Datemask2 mm/dd/yyyy
        $("#datemask2").inputmask("mm/dd/yyyy", {"placeholder": "mm/dd/yyyy"});
        //Money Euro
        $("[data-mask]").inputmask();
        //Date range picker
        $('#reservation').daterangepicker();
        //Date range picker with time picker
        $('#reservationtime').daterangepicker({timePicker: true, timePickerIncrement: 30, format: 'MM/DD/YYYY h:mm A'});
        //Date range as a button
        $('#daterange-btn').daterangepicker(
                {
                    ranges: {
                        'Today': [moment(), moment()],
                        'Yesterday': [moment().subtract(1, 'days'), moment().subtract(1, 'days')],
                        'Last 7 Days': [moment().subtract(6, 'days'), moment()],
                        'Last 30 Days': [moment().subtract(29, 'days'), moment()],
                        'This Month': [moment().startOf('month'), moment().endOf('month')],
                        'Last Month': [moment().subtract(1, 'month').startOf('month'), moment().subtract(1, 'month').endOf('month')]
                    },
                    startDate: moment().subtract(29, 'days'),
                    endDate: moment()
                },
                function (start, end) {
                    $('#daterange-btn span').html(start.format('MMMM D, YYYY') + ' - ' + end.format('MMMM D, YYYY'));
                }
        );
        //Date picker
//        $('#datepicker').datepicker({
//            autoclose: true
//        });
        $('#datepicker').datepicker({
            format: 'yyyy-mm-dd',
            autoclose: true

        });
        //iCheck for checkbox and radio inputs
        $('input[type="checkbox"].minimal, input[type="radio"].minimal').iCheck({
            checkboxClass: 'icheckbox_minimal-blue',
            radioClass: 'iradio_minimal-blue'
        });
        //Red color scheme for iCheck
        $('input[type="checkbox"].minimal-red, input[type="radio"].minimal-red').iCheck({
            checkboxClass: 'icheckbox_minimal-red',
            radioClass: 'iradio_minimal-red'
        });
        //Flat red color scheme for iCheck
        $('input[type="checkbox"].flat-red, input[type="radio"].flat-red').iCheck({
            checkboxClass: 'icheckbox_flat-green',
            radioClass: 'iradio_flat-green'
        });
        //Colorpicker
        $(".my-colorpicker1").colorpicker();
        //color picker with addon
        $(".my-colorpicker2").colorpicker();
        //Timepicker
        $(".timepicker").timepicker({
            showInputs: false
        });
    });
</script>


