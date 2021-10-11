<%@include file="common/header.jspf" %>

<div class="container">
		<h1><b>Add Your New Vehicle</b></h1>

		<form:form action="/addVehicle" method="post" modelAttribute="vehicle">
		
			<fieldset class="form-group">
				<form:label path="v_reg_no">Vehicle Registration Number:</form:label>
				<form:input style="width:450px"  path="v_reg_no" type="text" class="form-control" placeholder="Enter Vehicle Registration Number" required="required"/>
				<form:errors path="v_reg_no" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="modelNumber">Vehicle Model Number:</form:label>
				<form:input style="width:450px" path="modelNumber" type="tel" pattern="[1-2]{1}[0-9]{3}"
				 class="form-control" placeholder="Enter Vehicle Model Number" required="required"/>
				<form:errors path="modelNumber" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="category">Vehicle Category:</form:label>
				<form:input style="width:450px" path="category" type="text" pattern="mini|go|pro"
				 class="form-control" 
				placeholder="Enter Vehicle Category (mini or elite)" required="required"/>
				<form:errors path="category" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="status">Avalibility Status:</form:label>
				<form:input style="width:450px" path="status" type="bool" class="form-control" 
				placeholder="Enter Vehicle Avalibility status (true or false)" required="required"/>
				<form:errors path="status" cssClass="text-warning" />
			</fieldset>
			
			
			<fieldset class="form-group">
				<form:label path="v_make">Vehicle Make:</form:label>
				<form:input style="width:450px" path="v_make" type="text" class="form-control" 
				placeholder="Enter Vehicle Make : " required="required"/>
				<form:errors path="v_make" cssClass="text-warning" />
			</fieldset>
			
			
			<fieldset class="form-group">
				<form:label path="V_description">Description</form:label>
				<form:input style="width:450px" path="v_description" type="text" class="form-control"
				placeholder="Enter Vehicle Description : " required="required"/>
				<form:errors path="v_description" cssClass="text-warning" />
			</fieldset>
			
			
			
			
			<button type="submit" class="btn btn-success">Submit</button>
		</form:form>
		
	</div>
<%@include file="common/footer.jspf" %>
	