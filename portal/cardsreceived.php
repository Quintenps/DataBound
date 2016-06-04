<!DOCTYPE html>
<html>
<head>
    <!-- Standard Meta -->
    <meta charset="utf-8">
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0"
    name="viewport"><!-- Site Properties -->
    <title>Simple Data</title>
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
    <link href="../dist/components/form.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/card.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/label.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/modal.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/dimmer.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/transition.css" rel="stylesheet" type="text/css">


    <script src="https://code.jquery.com/jquery-2.2.4.min.js" integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44=" crossorigin="anonymous"></script>
    <script src="../components/modal.js"></script>
    <script src="../components/transition.js"></script>
    <script src="../components/dimmer.js"></script>


    <link href="../dist/components/menu.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/divider.css" rel="stylesheet" type=
    "text/css">
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
<?php include 'includes/menu.php'; ?>
<main class="Site-content">
    <div class="ui main container">

        <div class="ui grid">
            <div class="four wide column">
                <div class="ui breadcrumb">
                    <a class="section">Home</a>
                    <div class="divider">
                        /
                    </div><a class="active section">Dashboard</a>
                </div>
            </div>
        </div>
<br /><br />


<div class="ui massive middle aligned divided list">
  <?php 

  $names = array(
    'Christopher',
    'Ryan',
    'Ethan',
    'John',
    'Zoey',
    'Sarah',
    'Michelle',
    'Samantha',
);
 
$surnames = array(
    'Walker',
    'Thompson',
    'Anderson',
    'Johnson',
    'Tremblay',
    'Peltier',
    'Cunningham',
    'Simpson',
    'Mercado',
    'Sellers'
);


$i = 1;
  while($i < 5){
    $random_name = $names[mt_rand(0, sizeof($names) - 1)];
    $random_surname = $surnames[mt_rand(0, sizeof($surnames) - 1)];
    echo '
  <div class="item">
      <div class="right floated content">
      <a class="ui blue label"><i class="arrow up icon"></i> PublicCard</a>
          <a class="ui blue label"><i class="arrow down icon"></i> PublicCard</a>
          <a class="ui green label"><i class="arrow down icon"></i> UnknownCard</a>
      </div>

    <img class="ui avatar image" src="https://api.adorable.io/avatars/128/.'.rand(1,50000).'@adorable.io.png">
    <div class="content">
      '.$random_name . ' ' . $random_surname.'
    </div>
    <div class="ui modal">
  <i class="close icon"></i>
  <div class="header">
    Quinten\'s public card
  </div>
  <div class="image content">
    <div class="description">
<div class="ui list">
  <div class="item">
    <i class="users icon"></i>
    <div class="content">
      Quinten Roelof Peels
    </div>
  </div>
  <div class="item">
    <i class="marker icon"></i>
    <div class="content">
      The Netherlands, Utrecht, Houten
    </div>
  </div>
  <div class="item">
    <i class="mail icon"></i>
    <div class="content">
      <a href="mailto:#">Quinten@Peels.me</a>
    </div>
  </div>
</div>
    </div>
  </div>
</div>
  </div>';
$i++;} ?>

</div>
<script>
$(".blue").click(function(){
$('.ui.modal').modal('show');
});
</script>

</div>
        



    </div>
</main>
<footer><?php include 'includes/footer.php'; ?></footer>
</body>
</html>