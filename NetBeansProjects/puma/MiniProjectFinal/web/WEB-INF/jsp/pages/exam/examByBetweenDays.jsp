<form:form method="POST"  action="accountAddtoDb" modelAttribute="examByBetweenDays">
    <div class="box-header with-border">
        <i class="ion ion-clipboard"></i>
        <h3 class="box-title">Add New Profile</h3>
    </div>

    <div class="form-horizontal">



        <div class="box-body"><br>
            <div class="form-group">
                <label for="inputEmail3" class="pull-left col-sm-3">Register Number</label>

                <div class="col-sm-9">
                    <form:input path="regNo" class="form-control" data-inputmask="'mask': ['999999999V']" data-mask=""/>
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
                <label for="inputEmail3" class="pull-left col-sm-3">Full Amount</label>

                <div class="col-sm-9">
                    <form:input path="fullAmount" class="form-control" placeholder="Enter User Name."/>
                </div>
            </div>



            <div class="form-group">
                <label for="inputEmail3" class="pull-left col-sm-3">Account Number A</label>

                <div class="col-sm-9">
                    <form:input path="accountNumberA" class="form-control" id="inputEmail3" placeholder="Enter Address"/>
                </div>
            </div>









        </div>

    </div>
    <!--/.box-body--> 
    <div class="box-footer">
        <button  type="submit" class="btn btn-primary">Submit</button>

    </div>
</form:form>