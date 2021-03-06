<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html lang="ko">

        <head>
            <link rel="stylesheet" href="/webjars/origoni-startbootstrap-clean-blog/1.0.3/css/clean-blog.min.css">
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Hello Park</title>
        </head>

        <body>
            <div class="container">

                <c:out value='<xmp>' escapeXml="true"></c:out>
                <h2>Hello! ${name}</h2>
                <div>JSP version</div>
                <div class="page-header">
                    <h1>Buttons</h1>
                </div>
                <p>
                    <button type="button" class="btn btn-lg btn-default">Default</button>
                    <button type="button" class="btn btn-lg btn-primary">Primary</button>
                    <button type="button" class="btn btn-lg btn-success">Success</button>
                    <button type="button" class="btn btn-lg btn-info">Info</button>
                    <button type="button" class="btn btn-lg btn-warning">Warning</button>
                    <button type="button" class="btn btn-lg btn-danger">Danger</button>
                    <button type="button" class="btn btn-lg btn-link">Link</button>
                </p>
                <p>
                    <button type="button" class="btn btn-default">Default</button>
                    <button type="button" class="btn btn-primary">Primary</button>
                    <button type="button" class="btn btn-success">Success</button>
                    <button type="button" class="btn btn-info">Info</button>
                    <button type="button" class="btn btn-warning">Warning</button>
                    <button type="button" class="btn btn-danger">Danger</button>
                    <button type="button" class="btn btn-link">Link</button>
                </p>
                <p>
                    <button type="button" class="btn btn-sm btn-default">Default</button>
                    <button type="button" class="btn btn-sm btn-primary">Primary</button>
                    <button type="button" class="btn btn-sm btn-success">Success</button>
                    <button type="button" class="btn btn-sm btn-info">Info</button>
                    <button type="button" class="btn btn-sm btn-warning">Warning</button>
                    <button type="button" class="btn btn-sm btn-danger">Danger</button>
                    <button type="button" class="btn btn-sm btn-link">Link</button>
                </p>
                <p>
                    <button type="button" class="btn btn-xs btn-default">Default</button>
                    <button type="button" class="btn btn-xs btn-primary">Primary</button>
                    <button type="button" class="btn btn-xs btn-success">Success</button>
                    <button type="button" class="btn btn-xs btn-info">Info</button>
                    <button type="button" class="btn btn-xs btn-warning">Warning</button>
                    <button type="button" class="btn btn-xs btn-danger">Danger</button>
                    <button type="button" class="btn btn-xs btn-link">Link</button>
                </p>
            </div>
        </body>
        <script src="/webjars/jquery/3.6.0/jquery.min.js"></script>
        <script src="/webjars/origoni-startbootstrap-clean-blog/1.0.3/js/clean-blog.min.js"></script>

        </html>