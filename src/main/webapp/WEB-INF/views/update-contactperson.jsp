<%@include file="common/header.jspf" %>


<%@include file="common/footer.jspf" %>

<div class="container">
		<h1><b>Update Contact Person</b></h1>

		<form:form action="/updateContactPerson" method="post" modelAttribute="contactpersons">
		
		<form:hidden path="id"></form:hidden>
		<form:hidden path="company.id"></form:hidden>
		
		
			<fieldset class="form-group">
				<form:label path="name">Name</form:label>
				<form:input style="width:450px" path="name" type="text" class="form-control" placeholder="Enter Name : " required="required"/>
				<form:errors path="name" cssClass="text-warning" />
			</fieldset>
			
				
			<fieldset class="form-group">
				<form:label path="email">Email</form:label>
				<form:input style="width:450px" path="email" type="email" class="form-control" placeholder="Enter Email:" required="required"/>
				<form:errors path="email" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="cnic">CNIC</form:label>
				<form:input style="width:450px" path="cnic" type="tel" pattern="[0-9]{9}[0-9]{4}"
				 class="form-control" placeholder="Enter CNIC:" required="required"/>
				<form:errors path="cnic" cssClass="text-warning" />
			</fieldset>
			
			
			<fieldset class="form-group">
				<form:label path="phone">Phone Number</form:label>
				<form:input style="width:450px" path="phone" type="tel" pattern="[0]{1}[3]{1}[0-4]{1}[0-9]{1}[0-9]{7}"
				 class="form-control" placeholder="Enter Phone Number : " required="required"/>
				<form:errors path="phone" cssClass="text-warning" />
			</fieldset>
			
			

			<fieldset class="form-group">
				<form:label path="description">Description</form:label>
				<form:input style="width:450px" path="description" type="text" placeholder="Enter Description" class="form-control"/>
				<form:errors path="description" cssClass="text-warning" />
			</fieldset>
			
			
			<button type="submit" class="btn btn-success">Submit</button>
		</form:form>
		
	</div>
