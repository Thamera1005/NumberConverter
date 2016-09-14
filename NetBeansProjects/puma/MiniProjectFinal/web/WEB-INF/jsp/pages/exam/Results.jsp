
<div class="box box-comment">
    <div class="box-body">
        <div class="form-group">
            <label>Date range:</label>

            <div class="input-group">
                <div class="input-group-addon">
                    <i class="fa fa-calendar"></i>
                </div>
                <form id="resultserch">
                    <input type="text" name="date" class="form-control pull-right" id="reservation">
                    <input type="submit" value="search">
                </form>

            </div>
            <!-- /.input group -->
        </div>
    </div>
</div>
<script>
    $('#reservation').daterangepicker();
    $('#resultserch').on('submit', function (e) {
        e.preventDefault();
        e.preventDefault();
        
        var frm = $('#resultserch');
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
            "async": true,
            type: 'POST',
            url: 'addMakeForExam',
            "async": true,
                    data: data,
            success: function (callback) {
                $('#mainbody').empty();
                $('#addperson').empty();
                $('#viewperson').empty();
            },
            error: function () {
                $(this).html("Error!");
            }
        });
    });
</script>