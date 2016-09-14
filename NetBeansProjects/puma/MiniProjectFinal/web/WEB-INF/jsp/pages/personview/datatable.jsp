
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
                                <th>jhk</th>
                                <th>Nic</th>
                                <th>Name</th>
                                <th>Mobile Number</th>

                            </tr>
                        </thead>
                        <tbody>

                        </tbody>
                        <tfoot>
                            <tr>
                                <th></th>
                                <th>Nic</th>
                                <th>Name</th>
                                <th>Mobile Number</th>
                            </tr>
                        </tfoot>
                    </table>
                </div>

            </div>


        </div>

</section>




<button id="miiii">hjg</button>



<script>
    $(document).ready(function () {
        var table = $('#example2').DataTable({
            //"sDom" : domSetting,
            "oLanguage": {
                "sLengthMenu": "_MENU_ records per page",
                "sSearch": "<span class='add-on'><i class='icon-search'></i></span>Search Application:",
                "sZeroRecords": "No matching records found",
            },
            "iDisplayLength": 10,
            "aLengthMenu": [
                [5, 10, 20, 25, 50, -1],
                [5, 10, 20, 25, 50, "All"]
            ],
            "aaSorting": [
                [0, 'asc']
            ],
            "sAjaxSource": 'personaldetailsearchbynics',
            "columns": [
                {"data": "nic"},
                {"data": "fullName"},
                {"data": "shortNmae"},
                {"data": "age"},
                {"data": "MobileNumber"},
                {"data": "sex"},
                {"data": "birthDay"},
                {"data": "height"}
                
            ]
        });
    });

</script>