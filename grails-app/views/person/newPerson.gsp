<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<g:form name="personForm" url="[controller:'person',action:'create',method: 'post']">
    <p>
        <label>Name</label>
        <g:textField name="name" />
    </p>
    <p>
        <label>Age</label>
        <g:textField name="age" />
    </p>

    <input type="submit" value="Submit">
</g:form>
</body>
</html>