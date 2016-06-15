<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <!-- Standard Meta -->
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">

  <!-- Site Properties -->
  <title>DataBound :: Register</title>
  <link rel="stylesheet" type="text/css" href="dist/components/reset.css">
  <link rel="stylesheet" type="text/css" href="dist/components/site.css">

  <link rel="stylesheet" type="text/css" href="dist/components/container.css">
  <link rel="stylesheet" type="text/css" href="dist/components/grid.css">
  <link rel="stylesheet" type="text/css" href="dist/components/header.css">
  <link rel="stylesheet" type="text/css" href="dist/components/image.css">
  <link rel="stylesheet" type="text/css" href="dist/components/menu.css">

  <link rel="stylesheet" type="text/css" href="dist/components/divider.css">
  <link rel="stylesheet" type="text/css" href="dist/components/segment.css">
  <link rel="stylesheet" type="text/css" href="dist/components/form.css">
  <link rel="stylesheet" type="text/css" href="dist/components/input.css">
  <link rel="stylesheet" type="text/css" href="dist/components/button.css">
  <link rel="stylesheet" type="text/css" href="dist/components/list.css">
  <link rel="stylesheet" type="text/css" href="dist/components/message.css">
  <link rel="stylesheet" type="text/css" href="dist/components/icon.css">
  <link rel="stylesheet" type="text/css" href="dist/components/transition.css">
  <link rel="stylesheet" type="text/css" href="dist/components/modal.css">
  <link rel="stylesheet" type="text/css" href="dist/components/dimmer.css">




  <script src="https://code.jquery.com/jquery-2.2.4.min.js" integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44=" crossorigin="anonymous"></script>



  <script src="semantic.min.js"></script>



  <style type="text/css">
    body {
      background-color: #DADADA;
    }
    body > .grid {
      height: 100%;
    }
    .column {
      max-width: 450px;
    }
  </style>
  <script>
  $(document)
    .ready(function() {
      $('.ui.form')
        .form({
          fields: {
            password: {
              identifier  : 'username',
              rules: [
                {
                  type   : 'empty',
                  prompt : 'Please enter your username'
                },
              ]
            },
            password: {
              identifier  : 'password',
              rules: [
                {
                  type   : 'empty',
                  prompt : 'Please enter your password'
                },
                {
                  type   : 'minLength[6]',
                  prompt : 'Your password must be at least 6 characters'
                }
              ]
            }
          }
        })
      ;
      $('.ui.basic.modal')
              .modal('show')
      ;
    })
  $('.message .close')
          .on('click', function() {
              $(this)
                      .closest('.message')
                      .transition('fade')
              ;
          })
  ;

  </script>
</head>
<div class="ui basic modal">
    <div class="header">
        Please read carefully!
    </div>
    <div class="image content">
        <div class="image">
            <i class="warning sign icon"></i>
        </div>
        <div class="description">
            <p>This application does not have built in password encryption, in other words; we can see your password.<br /><br /> Please never use real passwords for this application.</p>
        </div>
    </div>
</div>
<body class="Site">
<div class="ui middle aligned center aligned grid">
  <div class="column">
    <h2 class="ui blue image header">
      <div class="content">
        Register new account


      </div>
    </h2>
    <form class="ui large form" method="post" action="RegisterServlet.do">
      <%
        Object msgs = request.getAttribute("msgs");
        if (msgs != null) {

          String errormsg = "<div class='ui negative message'><i class='close icon'></i><div class='header'>Error</div><p>User already exists!.</p></div>";
          out.println(errormsg);
        }
      %>
      <div class="ui error message"></div>
      <div class="ui stacked segment">
        <div class="field">
          <div class="ui left icon input">
            <i class="user icon"></i>
            <input type="text" name="username" placeholder="username">
          </div>
        </div>
        <div class="field">
          <div class="ui left icon input">
            <i class="lock icon"></i>
            <input type="password" name="password" placeholder="Password">
          </div>
        </div>
        <button type="submit" class="ui fluid large blue submit button">Register</button>
      </div>
    </form>
  </div>
</div>



</body>

</html>
