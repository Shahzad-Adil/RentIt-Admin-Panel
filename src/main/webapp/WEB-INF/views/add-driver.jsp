<%@include file="common/header.jspf" %>



<div class="container">
		<h1><b>Add a Company</b></h1>

		<form:form action="/addDriver" method="post" modelAttribute="driver">
		
			<fieldset class="form-group">
				<form:label path="name">Name</form:label>
				<form:input style="width:450px" path="name" type="text" class="form-control" 
					placeholder="Enter Name:" required="required"/>
				<form:errors path="name" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="userName">Username</form:label>
				<form:input style="width:450px" path="userName" type="text" placeholder="Enter Username:" class="form-control" required="required"/>
				<form:errors path="userName" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="password">Password</form:label>
				<form:input style="width:450px" path="password" type="text" class="form-control" placeholder="Enter Password:" required="required"/>
				<form:errors path="password" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="email">Email</form:label>
				<form:input style="width:450px" path="email" type="text" class="form-control" placeholder="Enter Email:" required="required"/>
				<form:errors path="email" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="cnic">CNIC</form:label>
				<form:input style="width:450px" path="cnic" type="text" class="form-control" placeholder="Enter CNIC:" required="required"/>
				<form:errors path="cnic" cssClass="text-warning" />
			</fieldset>
			
			
			<fieldset class="form-group">
				<form:label path="phone">Phone Number</form:label>
				<form:input style="width:450px" path="phone" type="text" class="form-control" placeholder="Enter Phone Number:" required="required"/>
				<form:errors path="phone" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="driver_on_trip">Driver is On trip?</form:label>
				<form:input style="width:450px" path="driver_on_trip" type="text" class="form-control" placeholder="Is Driver or Trip(true or false)" required="required"/>
				<form:errors path="driver_on_trip" cssClass="text-warning" />
			</fieldset>

			<fieldset class="form-group">
				<form:label path="description">Description</form:label>
				<form:input style="width:450px" path="description" type="text" placeholder="Enter any Description or comment" class="form-control"/>
				<form:errors path="description" cssClass="text-warning" />
			</fieldset>
			
			
			<button type="submit" class="btn btn-success">Submit</button>
		</form:form>
		
	</div>
<%@include file="common/footer.jspf" %>