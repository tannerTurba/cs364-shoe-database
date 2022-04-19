<%-- 
    Document   : response
    Created on : Apr 18, 2022, 7:09:30 PM
    Author     : becsc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shoes - {placeholder} </title>
    </head>
    <body>
        <tr> 
            <td><strong>Description: </strong></td>
            <td><span style="font-size:smaller; font-style:italic;">{placeholder}</span></td>
        </tr>
         <tr>
            <td><strong>Counselor: </strong></td>
            <td>{placeholder}
                <br>
                <span style="font-size:smaller; font-style:italic;">
                member since: {placeholder}</span>
            </td>
        </tr>
        <tr>
            <td><strong>Contact Details: </strong></td>
            <td><strong>email: </strong>
                <a href="mailto:{placeholder}">{placeholder}</a>
                <br><strong>phone: </strong>{placeholder}
            </td>
        </tr>
    </body>
</html>
