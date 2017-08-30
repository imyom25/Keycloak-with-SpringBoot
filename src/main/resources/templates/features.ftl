<#import "/spring.ftl" as spring>
    <html>
    <h1>Hello ${principal.getName()}</h1>
    <h1>Kite Features</h1>
    <ul>
        <#list features as feature>
            <li>${feature}</li>
        </#list>
    </ul>
    <p> <a href="/logout">Logout</a> </p>
    </html>