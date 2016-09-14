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
                            <i class="glyphicon glyphicon-eye-open"></i>
                            <h1 class="box-title">Search by Register No</h1>
                        </div>
                        <div class="box-body">
                            <form id="byReg" method="GET">
                                <div class="input-group">
                                    <input type="text" name="regisNo" placeholder="Type Message ..." class="form-control">
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
        $('#byReg').submit(function (e) {
            e.preventDefault();
            var frm = $('#byReg');


            var data = {}
            var Form = this;

            //Gather Data also remove undefined keys(buttons)
            $.each(this, function (i, v) {
                var input = $(v);
                data[input.attr("name")] = input.val();
                delete data["undefined"];
            });

            $.ajax({
                type: 'GET',
                url: 'accountNumberB',
                "async": true,
                data: data,
                success: function (callback) {




                    $('#viewperson').empty();
                    $('#viewperson').append(callback);


                    $('#edit').on('click', function (e) {
                        e.preventDefault();
                        $.ajax({
                            type: 'POST',
                            url: 'accountNumberB',
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

