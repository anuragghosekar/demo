<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Apply Leave</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<div style="text-align:center;"><h1>Apply Leave Page</h1></div>
	<div class="container" align="center">
		<div class="contain">
			<form action="applyLeave" method="post">
		      <label for="empno">
		      	Empno: <input type="number" name="empno" id="empno"/>
		      </label>
		      <br/>
		      <br/>
		      <label for="start_date">
		      	Start Date <input type="date" name="start_date" id="start_date"/>
		      </label>
		      <br/>
		      <br/>
		      <label for="end_date">
		      	End Date: <input type="date" name="end_date" id="end_date"/>
		      </label>
		      <br/>
		      <br/>
		      <label for="leave_type">
		      	Leave Type: 
				<select name="leave_type" id="leave_type">
		  			<option value="earned_leave">Earned Leave</option>
		  			<option value="loss_of_pay">Loss Of Pay</option>
				</select>
		      </label>
		      <br/>
		      <br/>
		      <label for="leave_reason">
		      	Leave Reason: 
				<select name="leave_reason" id="leave_reason">
		  			<option value="personal">Personal</option>
		  			<option value="sick">Sick</option>
		  			<option value="ritual">Ritual</option>
		  			<option value="Out_of_station">Out of Station</option>
				</select>
		      </label>
		      <br/>
		      <br/>
		      <button>Apply Leave</button>
		    </form>
		</div>
	</div>
</body>
</html>