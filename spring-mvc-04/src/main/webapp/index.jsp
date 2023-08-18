<html>
<body>
<h2>Add Course</h2>
<form action="http://localhost:8080/spring_mvc_04_war/app/course" method="post">
    <table>
        <tr>
            <td>Course Id:</td>
            <td><input type="number" name="courseId"></td>
        </tr>
        <tr>
            <td>Course Name:</td>
            <td><input type="text" name="courseName"></td>
        </tr>
        <tr>
            <td>Course Price:</td>
            <td><input type="number" name="coursePrice"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Add Course"></td>
        </tr>
    </table>

</form>

</body>
</html>
