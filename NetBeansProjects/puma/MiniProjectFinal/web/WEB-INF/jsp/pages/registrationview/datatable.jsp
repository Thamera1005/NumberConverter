
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
<!--                            <tr>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>




                            </tr>-->

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

<!--<script>
    $(function () {

//        $('thead').find('tr').empty();
//        $('thead').find('tr').append("<th>jhk</th>\n" +
//                "                                                <th>Nic</th>\n" +
//                "                                                <th>Name</th>\n" +
//                "                                                <th>Mobile Number</th>");
//
//        $.ajax({
//            type: 'POST',
//            url: 'personaldetailsearchbynics',
//            "async": true,
//            success: function (callback) {
//                $('tbody').find('tr').empty();
//                $.each(callback, function () {
//
//
//                    $('tbody').append("<tr>\n"
//                            + "<td></td>\n"
//                            + "<td>" + this["nic"] + "</td>\n"
//                            + "<td>" + this["shortName"] + "</td>\n"
//                            + "<td>" + this["mobileNumber"] + "</td>\n"
//                            + "<tr>");
//
//                });
//
//
//
//            },
//            error: function () {
//                $(this).html("Error!");
//            },
//           
//
//
//
//        });
//        $('tbody').find('tr').empty();



//        $('#example2').DataTable({
//            
//            "paging": true,
//            "lengthChange": false,
//            "searching": false,
//            "ordering": true,
//            "info": true,
//            "autoWidth": false,
//            "ajax": 'personaldetailsearchbynics',
//            "columns": [
//                {"data": "nic"},
//                {"data": "fullName"},
//                {"data": "shortNmae"},
//                {"data": "age"},
//                {"data": "MobileNumber"},
//                {"data": "sex"},
//                {"data": "birthDay"},
//                {"data": "height"},
//                {"data": "weight"},
//                {"data": "bloodGroup"},
//                {"data": "registrationdetailsCollection"},
//                
//            ]
//
//
//        });
//        $('#example2').dataTable({
//            "stateSave": true,
//            "stateLoadCallback": function (settings) {
//                var o;
//
//                // Send an Ajax request to the server to get the data. Note that
//                // this is a synchronous request.
//                $.ajax({
//                    "url": "personaldetailsearchbynics",
//                    "async": false,
//                    "dataType": "json",
//                    "success": function (json) {
//                        o = json;
//
//
//                    }
//                });
//
//                return o;
//            }
//    });
    });
</script>-->

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