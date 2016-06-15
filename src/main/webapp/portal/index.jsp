<!DOCTYPE html>
<html>
<head>
    <!-- Standard Meta -->
    <meta charset="utf-8">
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0"
    name="viewport"><!-- Site Properties -->
    <title>DataBound :: Dashboard</title>
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-57x57.png">
    <link rel="apple-touch-icon" sizes="60x60" href="/apple-touch-icon-60x60.png">
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-72x72.png">
    <link rel="apple-touch-icon" sizes="76x76" href="/apple-touch-icon-76x76.png">
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114x114.png">
    <link rel="apple-touch-icon" sizes="120x120" href="/apple-touch-icon-120x120.png">
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144x144.png">
    <link rel="apple-touch-icon" sizes="152x152" href="/apple-touch-icon-152x152.png">
    <link rel="apple-touch-icon" sizes="180x180" href="/apple-touch-icon-180x180.png">
    <link rel="icon" type="image/png" href="/favicon-32x32.png" sizes="32x32">
    <link rel="icon" type="image/png" href="/android-chrome-192x192.png" sizes="192x192">
    <link rel="icon" type="image/png" href="/favicon-96x96.png" sizes="96x96">
    <link rel="icon" type="image/png" href="/favicon-16x16.png" sizes="16x16">
    <link rel="manifest" href="/manifest.json">
    <link rel="mask-icon" href="/safari-pinned-tab.svg" color="#5bbad5">
    <meta name="msapplication-TileColor" content="#da532c">
    <meta name="msapplication-TileImage" content="/mstile-144x144.png">
    <meta name="theme-color" content="#ffffff">

    <link href="../dist/components/reset.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/site.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/container.css" rel="stylesheet" type=
    "text/css">
    <link href="../dist/components/grid.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/header.css" rel="stylesheet" type=
    "text/css">
    <link href="../dist/components/image.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/button.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/shape.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/breadcrumb.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/label.css" rel="stylesheet" type="text/css">

    <link href="../dist/components/menu.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/divider.css" rel="stylesheet" type=
    "text/css">
    <link href="../dist/components/message.css" rel="stylesheet" type=

            <link href="../dist/components/list.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/segment.css" rel="stylesheet" type=
    "text/css">
    <link href="../dist/components/dropdown.css" rel="stylesheet" type=
    "text/css">
    <link href="../dist/components/icon.css" rel="stylesheet" type="text/css">
    <link href="../dist/style.css" rel="stylesheet" type="text/css">

    <style type="text/css">
    body {
    background-color: #FFFFFF;
    }
    .ui.menu .item img.logo {
    margin-right: 1.5em;
    }
    .main.container {
    margin-top: 7em;
    }
    .wireframe {
    margin-top: 2em;
    }
    .ui.footer.segment {
    margin: 5em 0em 0em;
    padding: 5em 0em;
    }
    </style>
</head>
<body class="Site">
<script src="https://code.jquery.com/jquery-2.2.4.min.js" integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44=" crossorigin="anonymous"></script>
   <jsp:include page="includes/menu.jsp" />
    <main class="Site-content">
    <div class="ui main container">

        <div class="ui grid">
            <div class="four wide column">
                <div class="ui breadcrumb">
                    <a href="/portal/index.jsp" class="section">Home</a>
                    <div class="divider">
                        /
                    </div><a href="/portal/index.jsp" class="active section">Dashboard</a>
                </div>
            </div>
        </div>

  <div class="four column ui stackable grid">
    <div class="column">
      <a href="/portal/datastore.jsp" class="ui cube dashBlock shape">
        <div class="sides">
          <div class="active side">
            <div class="content">
              <div class="center">
                <i class="database icon"></i>
                <h5>My Datastore</h5>
              </div>
            </div>
          </div>
        </div>
      </a>
    </div>
    <div class="column">
     <a href="/portal/cards.jsp" class="ui cube dashBlock shape">
        <div class="sides">
          <div class="active side">
            <div class="content">
              <div class="center">
                <i class="file text outline icon"></i>
                <h5>My Cards</h5>
              </div>
            </div>
          </div>
        </div>
      </a>
    </div>
      <div class="column">
          <a href="/portal/userlisting.jsp" class="ui cube dashBlock shape">
              <div class="sides">
                  <div class="active side">
                      <div class="content">
                          <div class="center">
                              <i class="users icon"></i>
                              <h5>Memberlist</h5>
                          </div>
                      </div>
                  </div>
              </div>
          </a>
      </div>


    <div class="column">
      <h3>Quick Help</h3>
    <div class="ui vertical text menu">
      <a class="item">FAQ</a>
      <a class="item">Share cards</a>
      <a class="item">Filling my Datastore</a>
    </div>
    </div>
</div>

<div class="four column ui stackable grid">
    <div class="column">
     <a href="/portal/cardssent.jsp" class="ui cube dashBlock shape">
        <div class="sides">
          <div class="active side">
            <div class="content">
              <div class="center">
                <i class="send icon"></i>
                <h5>Cards sent</h5>
              </div>
            </div>
          </div>
        </div>
      </a>
    </div>

    <div class="column">
        <a href="/portal/cardsreceived.jsp" class="ui cube dashBlock shape">
            <div class="sides">
                <div class="active side">
                    <div class="content">
                        <div class="center">
                            <i class="inbox icon"></i>
                            <h5>Cards received</h5>
                        </div>
                    </div>
                </div>
            </div>
        </a>
    </div>




</div>


</div>
</main>


<jsp:include page="includes/footer.jsp" />
</body>
</html>