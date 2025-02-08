package com.metaarsenit.springboot_app.html;

public class HtmlProvider {
    static volatile String ADD = """
                <!DOCTYPE html>
                <html>
                <head>
                    <title>Сервлет приложение</title>
                    <style>
                        body * {
                            margin: 0;
                            padding: 0;
                        }
            
                        .form {
                            display: flex;
                            flex-direction: column;
                        }
                        .form_body {
                            display: flex;
                            flex-direction: column;
                            max-width: 400px;
                        }
            
                        .form_value {
                            display: flex;
                            flex-direction: row;
                            padding: 10px 5px 10px 5px;
                            justify-content: space-between;
                            align-items: center;
                            height: min-content;
                        }
            
                        .input {
                            width: 70%;
                            height: min-content;
                        }
            
                        h1 {
                            align-self: center;
                        }
            
                        .button {
                            margin-top: 10px;
                            width: 60%;
                            align-self: center;
                        }
                    </style>
                </head>
                <body>
                    <form action="/add" method="post" class="form">
                        <div class="form_body">
                            <h1>Рецепт</h1>
                            <div class="form_value">
                                <p>Название</p>
                                <input type="text" name="name" class="input" required/>
                            </div>
                            <div class="form_value">
                                <p>Ингредиент 1</p>
                                <input type="text" name="ingredients[]" class="input"/>
                            </div>
            
                            <div class="form_value">
                                <p>Ингредиент 2</p>
                                <input type="text" name="ingredients[]" class="input"/>
                            </div>
            
                            <div class="form_value">
                                <p>Ингредиент 3</p>
                                <input type="text" name="ingredients[]" class="input"/>
                            </div>
            
                            <div class="form_value">
                                <p>Ингредиент 4</p>
                                <input type="text" name="ingredients[]" class="input"/>
                            </div>
            
                            <div class="form_value">
                                <p>Ингредиент 5</p>
                                <input type="text" name="ingredients[]" class="input"/>
                            </div>
                            <button type="submit" class="button">Добавить</button>
                        </div>
                    </form>
                    <form action="/home" method="get" class="form">
                        <div class="form_body">
                            <button type="submit" class="button">Назад</button>
                        </div>
                    </form>
            
                </body>
            
                </html>
            """;

    static volatile String DELETE = """
            <!DOCTYPE html>
                            <html>
                            <head>
                                <title>Сервлет приложение</title>
                                <style>
                                    body * {
                                        margin: 0;
                                        padding: 0;
                                    }
                    
                                    .form {
                                        display: flex;
                                        flex-direction: column;
                                    }
                                    .form_body {
                                        display: flex;
                                        flex-direction: column;
                                        max-width: 400px;
                                    }
                      
                                    .form_value {
                                        display: flex;
                                        flex-direction: row;
                                        padding: 10px 5px 10px 5px;
                                        justify-content: space-between;
                                        align-items: center;
                                        height: min-content;
                                    }
                       
                                    .input {
                                        width: 70%;
                                        height: min-content;
                                    }
                       
                                    h1 {
                                        align-self: center;
                                    }
                       
                                    .button {
                                        margin-top: 10px;
                                        width: 60%;
                                        align-self: center;
                                    }
                                </style>
                            </head>
                            <body>
                                <h1>Объект удален!</h1>
                                <form action="/home" method="get" class="form">
                                    <div class="form_body">
                                        <button type="submit" class="button">Назад</button>
                                    </div>
                                </form>
                       
                            </body>
                       
                            </html>
            
            """;

    static volatile String HOME = """
            <!DOCTYPE html>
            <html>
                <head>
                    <title>Home</title>
                </head>
                <style>
                    body * {
                        padding: 0;
                        margin: 0;
                    }
            
                    .main {
                        width: 400px;
                        display: flex;
                        flex-direction: column;
                    }
            
                    form {
                        padding: 10px;
                    }
                    button {
                        width: 50%;
                        align-self: center;
                    }
                </style>
            <body>
                <div class="main">
                    <h1>Главная страница</h1>
                    <form action="/view" method="get">
                        <button type="submit">Посмотреть</button>
                    </form>
                    <form action="/add" method="get">
                        <button type="submit">Добавить</button>
                    </form>

                </div>
            
           
            </body>
            </html>
            """;

    public static String VIEW = """
            <!DOCTYPE html>
            <html>
                <head>
                    <title>View</title>
                </head>
                <style>
                    body * {
                        padding: 0;
                        margin: 0;
                    }
            
                    .main {
                        width: 400px;
                        display: flex;
                        flex-direction: column;
                    }
                    table {
                        border-spacing: 0px;
                        border-collapse: collapse;
                    }
            
                    table th {
                        border: 1px solid black;
                        padding: 10px;
                        margin: 0;
                        min-width: 150px;
                        font-weight: normal;
                    }
            
                    th form {
                        padding: 0;
                        margin: 0;
                    }
            
                    #deleteButton {
                        width: 100%;
                        height: 39px;
                    }
            
                    #buttonTh {
                        padding: 0;
                    }
            
                    form {
                        padding: 10px;
                    }
                    button {
                        width: 50%;
                        align-self: center;
                    }
            
                    #tableHeader * {
                        font-size: larger;
                        font-weight: bold;
                    }
            
                </style>
            <body>
                <div class="main">
                    <h1>Просмотреть</h1>
                    <table>
                        <tr id="tableHeader">
                            <th>Название</th>
                            <th>Ингредиент 1</th>
                            <th>Ингредиент 2</th>
                            <th>Ингредиент 3</th>
                            <th>Ингредиент 4</th>
                            <th>Ингредиент 5</th>
                            <th></th>
                        </tr>
                        DATAPLACEMENT
                    </table>
            
            
                    <form action="/home" method="get">
                        <button type="submit">Назад</button>
                    </form>
                </div>
            </body>
            </html>
            """;


    public static String getAddPage() {
        return ADD;
    }

    public static String getHomePage() {
        return HOME;
    }

    public static String getViewPage() {
        return VIEW;
    }

    public static String getDeletePage() {
        return DELETE;
    }
}
