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
                            <h1 class="box-title">Search by Name</h1>
                        </div>
                        <div class="box-body">
                            <form id="byname" method="POST">
                                <div class="input-group">
                                    <input type="text" name="message" placeholder="Type Message ..." class="form-control">
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
                url: 'personaldetailsearchbynic',
                "async": true,
                data: data,
                success: function (callback) {
                   
                      
                   

                        $('#viewperson').empty();
                        $('#nic').empty();


                        $('#viewperson').append("<div class=\"box box-primary\">\n" +
                                "            <div class=\"box-body box-danger\">\n" +
                                "                <img class=\"profile-user-img img-responsive img-circle\" src=\"dist/img/user4-128x128.jpg\" alt=\"User profile picture\">\n" +
                                "\n" +
                                "                <h3 class=\"profile-username text-center\">" + callback["shortName"] + "</h3>\n" +
                                "\n" +
                                "                <p class=\"text-muted text-center\">" + callback["address"] + "</p>\n" +
                                "\n" +
                                "                <ul class=\"list-group list-group-unbordered\">\n" +
                                "                    <li class=\"list-group-item\">\n" +
                                "                        <b>NIC</b> <a class=\"pull-right\">" + callback["nic"] + "</a>\n" +
                                "                    </li>\n" +
                                "                    <li class=\"list-group-item\">\n" +
                                "                        <b>Full Name</b> <a class=\"pull-right\">" + callback["fullName"] + "</a>\n" +
                                "                    </li>\n" +
                                "                    <li class=\"list-group-item\">\n" +
                                "                        <b>Mobile Number</b> <a class=\"pull-right\">" + callback["mobileNumber"] + "</a>\n" +
                                "                    </li>\n" +
                                "                    <li class=\"list-group-item\">\n" +
                                "                        <b>Date of Birth</b> <a class=\"pull-right\">" + callback["birthDay"] + "</a>\n" +
                                "                    </li>\n" +
                                "                    <li class=\"list-group-item\">\n" +
                                "                        <b>Age</b> <a class=\"pull-right\">" + callback["age"] + "</a>\n" +
                                "                    </li>\n" +
                                "                    <li class=\"list-group-item\">\n" +
                                "                        <b>Sex</b> <a class=\"pull-right\">" + callback["sex"] + "</a>\n" +
                                "                    </li>\n" +
                                "                    <li class=\"list-group-item\">\n" +
                                "                        <b>Height</b> <a class=\"pull-right\">" + callback["height"] + "</a>\n" +
                                "                    </li>\n" +
                                "                    <li class=\"list-group-item\">\n" +
                                "                        <b>Weight</b> <a class=\"pull-right\">" + callback["weight"] + "</a>\n" +
                                "                    </li>\n" +
                                "                    <li class=\"list-group-item\">\n" +
                                "                        <b>Blood Group</b> <a class=\"pull-right\">" + callback["bloodGroup"] + "</a>\n" +
                                "                    </li>\n" +
                                "</ul>\n<div class=\"row\">\n" +
                                "                    <div class=\"col-xs-6\">  <a id=\"edit\" class=\"btn btn-primary btn-block\"><b>Edit</b></a></div>\n" +
                                "                    <div class=\"col-xs-6\">  <a id=\"delete\" href=\"#\" class=\"btn btn-danger btn-block\"><b>Delete</b></a></div>\n" +
                                "                </div>");


                        $('#edit').on('click', function (e) {
                            e.preventDefault();
                            $.ajax({
                                type: 'POST',
                                url: 'personaldetailedit',
                                "async": true,
                                data: data,
                                success: function (callback) {
                                    $('#viewperson').load("datatable");
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
                                url: 'personaldetaildelete',
                                "async": true,
                                data: data,
                                success: function (callback) {
                                    alert("edit");
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
