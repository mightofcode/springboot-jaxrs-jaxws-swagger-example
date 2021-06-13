## swagger-ui:   
http://127.0.0.1:8080/swagger-ui/index.html 
## CXF api page
http://127.0.0.1:8080/service
## REST API:
http://127.0.0.1:8080/service/api/apiRest
## SOAP API WSDL:
http://127.0.0.1:8080/service/Hello?wsdl

SAOP API helloSoap:
POST http://127.0.0.1:8080/service/Hello
```
<?xml version="1.0" encoding="utf-8"?>
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/" xmlns:t="http://www.test.com">
  <soap:Body>
    <t:helloSoap>
    </t:helloSoap>
  </soap:Body>
</soap:Envelope>
```

SAOP API echo:
POST http://127.0.0.1:8080/service/Hello
```
<?xml version="1.0" encoding="utf-8"?>
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/" xmlns:t="http://www.test.com">
  <soap:Body>
    <t:echo>
    <param>hello</param>
    </t:echo>
  </soap:Body>
</soap:Envelope>
```




