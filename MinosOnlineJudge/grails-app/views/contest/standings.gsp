<!--
  To change this template, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
  <head>
    <meta name="layout" content="main">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Standings</title>
  </head>
  <body>
    <g:render template="/layouts/contest" />
    
    <div id="standings" class="content scaffold-list" role="main">
      <h1>Standings</h1>
      ${htmlTable}
    </div>
  </body>
</html>
