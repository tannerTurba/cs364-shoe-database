<%-- 
    Document   : index
    Created on : Apr 18, 2022, 6:45:29 PM
    Author     : becsc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shoe Database</title>
    </head>
    <body>
        <h1>Welcome to the Shoe Database</h1>

        <table border="0">
            <thead>
                <tr>
                    <th>Shoe Database contains a range of brands and the shoes they make</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>To view contact details of the authors of this database
                        select a subject below</td>
                </tr>
                <tr>
                    <td>
                        <form action="response.jsp">
                            <strong>Select a subject:</strong>
                            <select name="subject_id">
                                <option>Option 1</option>
                            </select>
                                <input type="submit" type="submit" name="submit"/>
                        </form>
                    </td>
                </tr>
            </tbody>
        </table>
    </body>
