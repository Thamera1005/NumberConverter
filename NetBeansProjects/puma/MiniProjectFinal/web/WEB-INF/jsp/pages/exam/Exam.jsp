
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
<title>AdminLTE 2 | Dashboard</title>
<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
<link rel="stylesheet" href="plugins/datatables/dataTables.bootstrap.css">
<link rel="stylesheet" href="dist/css/skins/_all-skins.min.css">



<section class="content">
    <div class="row">
        <div class="col-xs-12">
            <div class="box">
                <div class="box-header">
                    <h3 class="box-title">Not Allocated candidate Table</h3>
                </div>

                <div class="box-body">
                    <table id="example2" class="table table-bordered table-hover">
                        <thead>
                            <tr>
                                <th>Reg Number</th>
                                <th>Name</th>
                                <th>Date of Registered</th>
                            </tr>
                        </thead>
                        <tbody>

                            <c:forEach items="${examList}" var="list">
                                <tr>
                                    <td>${list.regNo}</td>
                                    <td>${list.nic.shortName}</td>
                                    <td>${list.day}</td>
                                    <td>
                                        <form>
                                            <input type="hidden" name="reg" value="${list.regNo}"/>
                                            <input type="submit"/>
                                        </form>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>

    </div>


    
</div>

</section>


<!--<script src="plugins/jQuery/jquery-2.2.3.min.js"></script>-->
<script src="bootstrap/js/bootstrap.min.js"></script>
<script src="plugins/datatables/jquery.dataTables.min.js"></script>
<script src="plugins/datatables/dataTables.bootstrap.min.js"></script>
<script src="plugins/slimScroll/jquery.slimscroll.min.js"></script>
<script src="plugins/fastclick/fastclick.js"></script>
<script src="dist/js/app.min.js"></script>
<script src="dist/js/demo.js"></script>
<script>
    $(function () {
        $('form').on('submit', function (e) {
            e.preventDefault();
//            var form = $(this).find('input[name="reg"]').val();
//            alert(form);

            var frm = this;
            e.preventDefault();

            var data = {}
            var Form = this;

            $.each(this, function (i, v) {
                var input = $(v);
                data[input.attr("name")] = input.val();
                delete data["undefined"];
            });
//            getExamTimetable


            $.ajax({
                "async": true,
                type: 'GET',
                url: 'getExamTimetable',
                "async": true,
                        data: data,
                success: function (callback) {
                    $('#viewperson').empty();
                    $('#viewperson').append(callback);
                },
                error: function () {
                    $(this).html("Error!");
                }
            });

        });
    })();
</script>

