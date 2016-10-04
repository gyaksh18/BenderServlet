<%--
  Created by IntelliJ IDEA.
  Created as methodical material for ACS department.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MyFirstServlet</title>
</head>
    <body>
        <h1>Сервлет для вычисления года рождения</h1>
        <form action="servlet" method="POST">
            <div>
                <p>Возраст : </p>
                <input type="text" name="age" value="" placeholder="Введите ваш возраст">
            </div>
            <input type="submit" value="Ответить" />
        </form>
    </body>
</html>
