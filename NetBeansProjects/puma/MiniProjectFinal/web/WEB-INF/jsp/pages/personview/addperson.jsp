

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

<link rel="stylesheet" href="plugins/daterangepicker/daterangepicker.css">

<link rel="stylesheet" href="plugins/datepicker/datepicker3.css">

<link rel="stylesheet" href="plugins/iCheck/all.css">

<link rel="stylesheet" href="plugins/colorpicker/bootstrap-colorpicker.min.css">

<link rel="stylesheet" href="plugins/timepicker/bootstrap-timepicker.min.css">

<link rel="stylesheet" href="plugins/select2/select2.min.css">

<link rel="stylesheet" href="dist/css/AdminLTE.min.css">

<link rel="stylesheet" href="dist/css/skins/_all-skins.min.css">
<script type="text/javascript" src="validation/dist/js/formValidation.js"></script>
<script type="text/javascript" src="validation/dist/js/framework/bootstrap.js"></script>




<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div class="box box-primary"> 
    <form:form method="POST"  action="personaldetailAdd" modelAttribute="account">
        <div class="box-header with-border">
            <i class="ion ion-clipboard"></i>
            <h3 class="box-title">Add New Profile</h3>
        </div>

        <div class="form-horizontal">



            <div class="box-body"><br>
                <div class="form-group">
                    <label for="inputEmail3" class="pull-left col-sm-3">NIC</label>

                    <div class="col-sm-9">
                        <form:input path="nic" class="form-control" data-inputmask="'mask': ['999999999V']" data-mask=""/>

                    </div>
                </div>
                <div class="form-group">
                    <label for="inputEmail3" class="pull-left col-sm-3">Full Name</label>

                    <div class="col-sm-9">
                        <form:input path="fullName" class="form-control" placeholder="Enter Full Name"/>
                    </div>
                </div>

                <div class="form-group">
                    <label for="inputEmail3" class="pull-left col-sm-3">Short Name</label>

                    <div class="col-sm-9">
                        <form:input path="shortName" class="form-control" placeholder="Enter User Name."/>
                    </div>
                </div>



                <div class="form-group">
                    <label for="inputEmail3" class="pull-left col-sm-3">Address</label>

                    <div class="col-sm-9">
                        <form:input path="address" class="form-control" id="inputEmail3" placeholder="Enter Address"/>
                    </div>
                </div>

                <div class="form-group">
                    <label class="pull-left col-sm-3">Mobile Number</label>
                    <div class="col-sm-9">
                        <div class="input-group">
                            <div class="input-group-addon">
                                <i class="fa fa-phone"></i>
                            </div>
                            <form:input path="mobileNumber" class="form-control" data-inputmask="'mask': ['(999)-9999999']" data-mask=""/>
                        </div>
                    </div>
                </div>


                <div class="form-group">
                    <label class=" col-sm-3 ">Date of Birth</label>
                    <div class="col-sm-9">
                        <div class="input-group date ">
                            <div class="input-group-addon">
                                <i class="fa fa-calendar"></i>
                            </div>
                            <form:input path="birthDay" class="form-control pull-right" id="datepicker" />
                        </div>
                    </div>

                </div>

                <div class="form-group">
                    <label for="inputPassword3" class=" pull-left col-sm-3 ">Blood Group</label>

                    <div class="col-sm-9">
                        <form:select path="bloodGroup" class="form-control">
                            <form:option value="O+">O+</form:option>
                            <form:option value="O-">O-</form:option>
                            <form:option value="A+">A+</form:option>
                            <form:option value="A-">A-</form:option>
                            <form:option value="B+">B+</form:option>
                            <form:option value="B-">B-</form:option>
                            <form:option value="AB">AB</form:option>
                        </form:select>
                    </div>
                </div>
                <br>
                <div class="form-group">
                    <div class="col-sm-12">
                        <div class="box box-default">
                            <br>
                            <div class="row ">
                                <div class="col-xs-6">
                                    <div class="form-group">
                                        <label for="inputEmail3" class="pull-left col-sm-3">Age</label>

                                        <div class="col-sm-9">
                                            <form:input path="age" class="form-control " id="inputEmail3" placeholder="Age"/>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xs-6">
                                    <div class="form-group">
                                        <label for="inputPassword3" class=" pull-left col-sm-3 ">Sex</label>

                                        <div class="col-sm-9">
                                            <form:select path="sex" class="form-control">
                                                <form:option value="male">Male</form:option>
                                                <form:option value="female">Female</form:option>

                                            </form:select>
                                        </div>
                                    </div>
                                </div>

                            </div>
                            <div class="row">
                                <div class="col-xs-6">
                                    <div class="form-group">
                                        <label for="inputPassword3" class=" pull-left col-sm-3 ">Height</label>

                                        <div class="col-sm-9">
                                            <form:input path="height" class="form-control " id="inputPassword3" placeholder="Height in cm"/>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xs-6">
                                    <div class="form-group">
                                        <label for="inputPassword3" class=" pull-left col-sm-3 ">Weight</label>

                                        <div class="col-sm-9">
                                            <form:input path="weight" class="form-control " id="inputPassword3" placeholder="Weight in kg"/>
                                        </div>
                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3" for="exampleInputFile">Photo</label>
                    <div class="col-sm-9">
                        <input type="file" class="filename " id="inputName"/>
                    </div>

                </div>

            </div>

        </div>
        <!--/.box-body--> 
        <div class="box-footer">
            <button  type="submit" class="btn btn-primary">Submit</button>

        </div>
    </form:form>
</div>

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
                url: 'personaldetailAdd',
                dataType: 'json',
                data: JSON.stringify(data),
                success: function (callback) {
                    if (callback["nic"] == "duplicate") {
                        $('#viewperson').append("<div class=\"box-body\">\n" +
                                "                                        <div class=\"alert alert-danger alert-danger\">\n" +
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


// Generate a simple captcha
        function randomNumber(min, max) {
            return Math.floor(Math.random() * (max - min + 1) + min);
        }
        ;
        $('#captchaOperation').html([randomNumber(1, 100), '+', randomNumber(1, 200), '='].join(' '));


        $('#account').formValidation({
            message: 'This value is not valid',
            icon: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                fullName: {
                    row: '.col-sm-4',
                    validators: {
                        notEmpty: {
                            message: 'The first name is required'
                        }
                    }
                },
                shortName: {
                    row: '.col-sm-4',
                    validators: {
                        notEmpty: {
                            message: 'The last name is required'
                        }
                    }
                },
                nic: {
                    message: 'The nic is not valid',
                    validators: {
                        notEmpty: {
                            message: 'The nic is required'
                        },
                        stringLength: {
                            min: 6,
                            max: 30,
                            message: 'The nic must be more than 6 and less than 30 characters long'
                        },
                        regexp: {
                            regexp: /^[a-zA-Z0-9_\.]+$/,
                            message: 'The nic can only consist of number, dot and underscore'
                        }
                    }
                },
                mobileNumber: {
                    message: 'The mobile Number is not valid',
                    validators: {
                        notEmpty: {
                            message: 'The mobile Number is required'
                        },
                        stringLength: {
                            min: 10,
                            max: 10,
                            message: 'The mobile Number must be more than 10 and less than 30 characters long'
                        },
                        regexp: {
                            regexp: /^[0-9_\.]+$/,
                            message: 'The nic can only consist of number, dot and underscore'
                        }
                    }
                },
                email: {
                    validators: {
                        notEmpty: {
                            message: 'The email address is required'
                        },
                        emailAddress: {
                            message: 'The input is not a valid email address'
                        }
                    }
                },
                password: {
                    validators: {
                        notEmpty: {
                            message: 'The password is required'
                        },
                        different: {
                            field: 'username',
                            message: 'The password cannot be the same as username'
                        }
                    }
                },
                gender: {
                    validators: {
                        notEmpty: {
                            message: 'The gender is required'
                        }
                    }
                },
                captcha: {
                    validators: {
                        callback: {
                            message: 'Wrong answer',
                            callback: function (value, validator, $field) {
                                var items = $('#captchaOperation').html().split(' '), sum = parseInt(items[0]) + parseInt(items[2]);
                                return value == sum;
                            }
                        }
                    }
                },
                agree: {
                    validators: {
                        notEmpty: {
                            message: 'You must agree with the terms and conditions'
                        }
                    }
                }
            }
        });
    })();
</script>

<script>

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

</script>

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

