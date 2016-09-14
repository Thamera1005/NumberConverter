
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<div class="box">
    <div class="box-header">
        <h3 class="box-title">Exam Table</h3>
    </div>
    <!-- /.box-header -->
    <div class="box-body no-padding">
        <table class="table">
            <tr>
                <th style="width: 10px">#</th>
                <th>Nic Number</th>
                <th>Name</th>
                
            </tr>
            <c:forEach items="${examListAllocatedModel}" var="list">
                <c:out value=""></c:out>

                    <tr>
                        <td><i class="fa-certificate"></i></td>
                        <td>${list.nic}</td>
                    <td>
                        ${list.shortName}
                    </td>
                    
                </tr>
            </c:forEach>
        </table>

    </div>
    <div class="box box-footer">
        <div class="form-group">

            <div class="col-sm-12">
                <div class="input-group date ">
                    <div class="input-group-addon">
                        <i class="fa fa-calendar"></i>
                    </div>
                    <form id="timedataallocate" action="timeSelect" method="GET">
                        <input name="selectDate" type="date" class="form-control pull-right" id="datepicker" />
                        <input id="addbutton" value="Add"class="form-control btn btn-danger"type="submit"/>
                    </form>

                </div>
            </div>

        </div>
    </div>

</div>


<script>
    $(function () {
        $('#timedataallocate').on('submit', function (e) {
            e.preventDefault();
            e.preventDefault();
            var frm = $('#timedataallocate');
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
                url: 'addExamList',
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
    });
</script>
<script>
    $('#datepicker').datepicker({
        format: 'yyyy-mm-dd',
        autoclose: true

    });
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


</script>





