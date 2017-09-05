<%--
  Created by IntelliJ IDEA.
  User: allard
  Date: 16/03/2017
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Track toevoegen aan Playlist</title>
    <form action="#" method="post">
    <table>
        <tr  bgcolor="#E6E6FA">
            <th>Title</th>
            <th>Performer</th>
            <th>Duration</th>
            <th>Album</th>
            <th>Playcount</th>
            <th>Publicationdate</th>
            <th>Description</th>
            <th>Add</th>
        </tr>
        <tr>
            <td>One day remains</td>
            <td>Alter Bridge</td>
            <td>3:30</td>
            <td>One Day Remains</td>
            <td>1</td>
            <td>16-3-2017</td>
            <td>Dit is een liedje.</td>
            <td><input type="checkbox" name="check_list[]" value="trackID"></td>
        </tr>

    </table>


        <input type="submit" name="submit" value="Submit"/>
    </form>

</head>
<body>

</body>
</html>
