

<%@include file="common/header.jspf" %>
<div class="container">
		<h1><b>Update a Vehicle</b></h1>
	  

		<form:form action="/updateVehicle" method="post" modelAttribute="vehicle">
				<form:hidden path="id"/>
				<form:hidden path="company.id"/>
				<form:hidden path="terminal.id"/>
				<form:hidden path="v_reg_no"/>
				<form:hidden path="modelNumber"/>
			
			
			<fieldset class="form-group">
				<form:label path="category">Vehicle Category:</form:label>
				<form:input style="width:450px" path="category" type="text" pattern="mini|go|pro" class="form-control" 
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
				<form:label path="terminalId">Terminal:</form:label>
				<form:input style="width:450px" path="terminalId" type="number" class="form-control" 
				placeholder="Vehicle is At:  " required="required"/>
				<form:errors path="terminalId" cssClass="text-warning" />
			</fieldset>
			
			<form:hidden path="v_make"/>
			
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