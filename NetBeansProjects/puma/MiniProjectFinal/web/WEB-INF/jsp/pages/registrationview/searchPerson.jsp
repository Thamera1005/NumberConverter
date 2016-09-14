<div class="row">
    <div class="box box-success">
        <div class="box-header " style="text-align: center;">
            <i class="glyphicon glyphicon-search"></i>
            <h1 class="box-title">Search</h1>
        </div>
        <div class="box-body">
            <div class="col-md-offset-1 col-md-10 bg-green">
                <div class="col-md-offset-3 col-md-6">
                    <br>
                    <div class="box box-success">
                        <div class="box-header with-border">
                            <i class="glyphicon glyphicon-user"></i>                                                           
                            <h3 class="box-title">Search by NIC</h3>
                        </div>
                        <div class="box-body">
                            <form  id="bynic" method="POST">
                                <div class="input-group">
                                    <input type="text" name="nic" id="nic" placeholder="Type Message ..." class="form-control">
                                    <span class="input-group-btn">
                                        <button type="submit" class="btn btn-primary btn-flat">Search</button>
                                    </span>
                                </div>
                            </form>
                        </div>
                        <div class="box-footer">

                        </div>

                    </div>
                </div>
                <div class="col-md-offset-3 col-md-6">
                    <br>
                    <div class="box box-success">
                        <div class="box-header with-border">
                            <i class="glyphicon glyphicon-eye-open"></i>
                            <h1 class="box-title">Search by Register</h1>
                        </div>
                        <div class="box-body">
                            <form id="byreg" method="POST">
                                <div class="input-group">
                                    <input type="text" name="reg" placeholder="Type Message ..." class="form-control">
                                    <span class="input-group-btn">
                                        <button type="submit" class="btn btn-primary btn-flat">Search</button>
                                    </span>
                                </div>
                            </form>
                        </div>
                        <div class="box-footer">

                        </div>

                    </div>
                </div>
            </div>
        </div>

        <div class="box-footer" >

        </div>
    </div>


</div>

<script>
    (function () {
        $('#bynic').submit(function (e) {

            var frm = $('#bynic');
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
                type: 'POST',
                url: 'registrationdetailsearchbynic',
                "async": true,
                data: data,
                success: function (callback) {




                    $('#viewperson').empty();
                    $('#nic').empty();
                    jQuery.each(callback, function (index, item) {
                        $('#viewperson').append("<div class=\"box box-primary\">\n" +
                                "                                \n" +
                                "                                <div class=\"box-body\">\n" +
                                "                                    <ul class=\"todo-list\">\n" +
                                "                                        <li>\n" +
                                "                                            <span class=\"handle\">\n" +
                                "                                                <i class=\"fa fa-ellipsis-v\"></i>\n" +
                                "                                                <i class=\"fa fa-ellipsis-v\"></i>\n" +
                                "                                            </span>\n" +
                                "                                            \n" +
                                "                                            <span class=\"text\">" + item["regNo"] + "</span>\n" +
                                "                                            <small class=\"label label-danger\"><i class=\"fa fa-clock-o\"></i> " + item["day"] + "</small>\n" +
                                "                                            <div class=\"tools\">\n" +
                                "                                                <a id=\"regnumber\"><i class=\"fa fa-trash-o\"></i></a>\n" +
                                "                                            </div>\n" +
                                "                                        </li>\n" +
                                "                                      \n" +
                                "                                    </ul>\n" +
                                "                                </div>\n" +
                                "                                \n" +
                                "                            </div>");



                    });

                },
                error: function () {
                    $(this).html("Error!");
                }
            });
        });
        $('#byreg').submit(function (e) {

            var frm = $('#byreg');
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
                type: 'POST',
                url: 'registrationserch',
                "async": true,
                data: data,
                success: function (callback) {




                    $('#viewperson').empty();
                    $('#nic').empty();
                    $('#viewperson').append("<div class=\"box box-primary\">\n" +
                            "            <div class=\"box-body box-danger\">\n" +
                            "                <ul class=\"list-group list-group-unbordered\">\n" +
                            "                    <li class=\"list-group-item\">\n" +
                            "                        <b>NIC</b> <a class=\"pull-right\">" + callback["regNo"] + "</a>\n" +
                            "                    </li>\n" +
                            "                    <li class=\"list-group-item\">\n" +
                            "                        <b>Full Name</b> <a class=\"pull-right\">" + callback["day"] + "</a>\n" +
                            "                    </li>\n" +
                            "                    <li class=\"list-group-item\">\n" +
                            "                        <b>Mobile Number</b> <a class=\"pull-right\">" + callback["drivingLicenceClasses"] + "</a>\n" +
                            "                    </li>\n" +
                            "                    <li class=\"list-group-item\">\n" +
                            "                        <b>Date of Birth</b> <a class=\"pull-right\">" + callback["vehicleRestrictions"] + "</a>\n" +
                            "                    </li>\n" +
                            "                    <li class=\"list-group-item\">\n" +
                            "                        <b>Age</b> <a class=\"pull-right\">" + callback["transactionType"] + "</a>\n" +
                            "                    </li>\n" +
                            "                    <li class=\"list-group-item\">\n" +
                            "                        <b>Sex</b> <a class=\"pull-right\">" + callback["licenceIssuedate"] + "</a>\n" +
                            "                    </li>\n" +
                            "                    <li class=\"list-group-item\">\n" +
                            "                        <b>Height</b> <a class=\"pull-right\">" + callback["nTMIDate"] + "</a>\n" +
                            "                    </li>\n" +
                            "                    <li class=\"list-group-item\">\n" +
                            "                        <b>Weight</b> <a class=\"pull-right\">" + callback["nTMINumber"] + "</a>\n" +
                            "                    </li>\n" +
                            "                    <li class=\"list-group-item\">\n" +
                            "                        <b>Blood Group</b> <a class=\"pull-right\">" + callback["oldDrivingLicenceNumber"] + "</a>\n" +
                            "                    </li>\n" +
                            "</ul>\n<div class=\"row\">\n" +
                            "                    <div class=\"col-xs-6\">  <a id=\"edit\" class=\"btn btn-primary btn-block\"><b>Edit</b></a></div>\n" +
                            "                    <div class=\"col-xs-6\">  <a id=\"delete\" href=\"#\" class=\"btn btn-danger btn-block\"><b>Delete</b></a></div>\n" +
                            "                </div>");

                    $('#edit').on('click', function (e) {
                        e.preventDefault();
                        $.ajax({
                            type: 'POST',
                            url: 'regdetailedit',
                            "async": true,
                            data: data,
                            success: function (callback) {
                                $('#viewperson').empty();
                                $('#addperson').empty();
                                $('#addperson').append(callback);


                            },
                            error: function () {
                                $(this).html("Error!");
                            }
                        });

                    });
                    $('#delete').on('click', function (e) {
                        e.preventDefault();
                        $.ajax({
                            type: 'POST',
                            url: 'registrationdetaildelete',
                            "async": true,
                            data: data,
                            success: function (callback) {
                                $('#viewperson').empty();
                                $('#addperson').empty();
                            },
                            error: function () {
                                $(this).html("Error!");
                            }
                        });

                    });


                },
                error: function () {
                    $(this).html("Error!");
                }
            });
        });

    })();
</script>
