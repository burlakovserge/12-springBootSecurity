<#import "parts/doctype.ftl" as dt>
<@dt.page>
    <div>
        "hello"
    </div>
    <#list tasksList as t>
    <div>
        <b>${t.id}</b>
        <i>${t.name}</i>
        <span>${t.commentary}</span>
    </div>
        <#else>
        No tasks added
    </#list>

<#--<body>-->
<#--    <div id="book-form">-->
<#--        <form>-->
<#--            <h2>Добавление книги</h2>-->
<#--            <label>Название книги:</label>-->
<#--            <input type="text" name="name" value="">-->
<#--            <label>Год выпуска:</label>-->
<#--            <input type="text" name="year" value="">-->
<#--            <hr>-->
<#--            <button id="save-book">Сохранить</button>-->
<#--        </form>-->
<#--    </div>-->
<#--    <h1>Библиотека (<span th:text="${booksCount}">0</span>)</h1>-->
<#--    <button id="show-add-book-form">Добавить книгу</button>-->
<#--    <br><br>-->
<#--    <div id="book-list">-->
<#--        <div th:each="book : ${books}">-->
<#--            <a href="#" class="book-link" th:attr="data-id=${book.id}" th:text="${book.name}"></a>-->
<#--        </div>-->
<#--    </div>-->
<#--    <p th:text="${someParameter}"></p>-->
<#--</body>-->
</@dt.page>