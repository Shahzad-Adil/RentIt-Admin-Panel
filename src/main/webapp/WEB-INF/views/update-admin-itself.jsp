<%@include file="common/header.jspf" %>


<div class="container">
		
		
		<h1><b>Update Your Profile</b></h1>
	  

		<form:form action="/updateAdminItself" method="post" modelAttribute="admin"
		style="
		margin-top: 55px;
 		 margin-bottom: 100px;
  		margin-right: 150px;
  		margin-left: 80px;">
  		
		
			<form:hidden path="id"/>
			<form:hidden path="userName"/>
			
			<fieldset class="form-group">
				<form:label path="fullName">Full Name:</form:label>
				<form:input style="width:450px" path="fullName" type="text" class="form-control" required="required"/>
				<form:errors path="fullName" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="password">Password:</form:label>
				<form:input style="width:450px" path="password" type="password" class="form-control"
				 required="required"  minlength="6"/>
				<form:errors path="password" cssClass="text-warning" />
			</fieldset>
			
			
			<fieldset class="form-group">
				<form:label path="cnic">CNIC:</form:label>
				<form:input style="width:450px" path="cnic" type="tel" 
				class="form-control" required="required" pattern="[0-9]{9}[0-9]{4}"/>
				<form:errors path="cnic" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="email">Email Address:</form:label>
				<form:input style="width:450px" path="email" type="email" class="form-control" required="required"/>
				<form:errors path="email" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="phone">Phone Number:</form:label>
				<form:input style="width:450px" path="phone" type="tel" class="form-control"
				 required="required" pattern="[0]{1}[3]{1}[0-4]{1}[0-9]{1}[0-9]{7}" />
				<form:errors path="phone" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="description">Description</form:label>
				<form:input style="width:450px" path="description" type="text" class="form-control" required="required"/>
				<form:errors path="description" cssClass="text-warning" />
			</fieldset>
			<br>
			<button type="submit" class="btn btn-success">Submit</button>
		</form:form>
		
	</div>




<%@include file="common/footer.jspf" %>