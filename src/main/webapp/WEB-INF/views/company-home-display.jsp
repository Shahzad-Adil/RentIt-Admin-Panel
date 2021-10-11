<%@include file="common/header.jspf" %>
<%@include file="common/companyNavigation.jspf" %>



<div class="container">
<h1>Welcome ${company.name}</h1>				
<table class="table table-striped" style="margin:auto; width:50%">
<caption>
		<b>Your Profile Is:</b>
</caption>

	
		<tr>
			<td>Name</td>
			<td>${company.name}</td>
		</tr>
		
		<tr>
			<td>Description</td>
			<td>${company.description}</td>
		</tr>
		
	</table>
		<fieldset class="form-group">
				<a  style="margin-left:285px; margin-top:5px;" class="btn btn-success" href="/updateCompanyItself?id=${company.id}">Update Profile</a>
			</fieldset>
			
			</div>


<%@include file="common/footer.jspf" %>

<%@include file="common/highlight.jspf" %>
