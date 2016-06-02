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
    <link href="../dist/components/checkbox.css" rel="stylesheet" type="text/css">

    <script src="https://code.jquery.com/jquery-2.2.4.min.js" integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44=" crossorigin="anonymous"></script> 
    <script src="../dist/components/form.min.js"></script>
    <script src="../dist/components/checkbox.min.js"></script>


    

    <link href="../dist/components/card.css" rel="stylesheet" type="text/css">

    <link href="../dist/style.css" rel="stylesheet" type="text/css">



    <link href="../dist/components/menu.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/divider.css" rel="stylesheet" type=
    "text/css">
    <link href="../dist/components/list.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/segment.css" rel="stylesheet" type=
    "text/css">
    <link href="../dist/components/dropdown.css" rel="stylesheet" type=
    "text/css">
    <link href="../dist/components/icon.css" rel="stylesheet" type="text/css">
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
<header><?php include 'includes/menu.php'; ?></header>
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

<div class="ui grid row stackable">
<h1>Editing: Business card</h1>
</div><br /><br />

<div class="ui form">
  <h3>Personal data</h3>
  
  <div class="inline field">
    <div class="ui toggle checkbox">
      <input type="checkbox" tabindex="0" class="hidden">
      <label>First name</label>
    </div>
  </div>

    <div class="inline field">
    <div class="ui toggle checkbox">
      <input type="checkbox" tabindex="0" class="hidden">
      <label>Middle name</label>
    </div>
  </div>

    <div class="inline field">
    <div class="ui toggle checkbox">
      <input type="checkbox" tabindex="0" class="hidden">
      <label>Last name</label>
    </div>
  </div>

    <div class="inline field">
    <div class="ui toggle checkbox">
      <input type="checkbox" tabindex="0" class="hidden">
      <label>Age</label>
    </div>
  </div>

    <div class="inline field">
    <div class="ui toggle checkbox">
      <input type="checkbox" tabindex="0" class="hidden">
      <label>Gender</label>
    </div>
  </div>

    <div class="inline field">
    <div class="ui toggle checkbox">
      <input type="checkbox" tabindex="0" class="hidden">
      <label>Date of Birth</label>
    </div>
  </div>

      <div class="inline field">
    <div class="ui toggle checkbox">
      <input type="checkbox" tabindex="0" class="hidden">
      <label>Place of Birth</label>
    </div>
  </div>
</div>
<br /><br />
<div class="ui form">
  <h3>Online presence</h3>
  
  <div class="inline field">
    <div class="ui toggle checkbox">
      <input type="checkbox" tabindex="0" class="hidden">
      <label>Email personal</label>
    </div>
  </div>

    <div class="inline field">
    <div class="ui toggle checkbox">
      <input type="checkbox" tabindex="0" class="hidden">
      <label>Email business</label>
    </div>
  </div>

    <div class="inline field">
    <div class="ui toggle checkbox">
      <input type="checkbox" tabindex="0" class="hidden">
      <label>Website URL</label>
    </div>
  </div>

    <div class="inline field">
    <div class="ui toggle checkbox">
      <input type="checkbox" tabindex="0" class="hidden">
      <label>Facebook URL</label>
    </div>
  </div>

    <div class="inline field">
    <div class="ui toggle checkbox">
      <input type="checkbox" tabindex="0" class="hidden">
      <label>Twitter</label>
    </div>
  </div>

    <div class="inline field">
    <div class="ui toggle checkbox">
      <input type="checkbox" tabindex="0" class="hidden">
      <label>Skype</label>
    </div>
  </div>

</div><br /><br />
<button class="ui green button">Update card</button>
</form>

</div>
        
    <script>
$('.ui.checkbox').checkbox();

$(function(){
    $('.orange').click(function(){
        var select_all = (this.value === 'Select All');
        $('input:checkbox').attr('checked', select_all);
        this.value = (select_all) ? 'Deselect All' : 'Select All';        
    });
});

</script>


    </div></main>
<footer><?php include 'includes/footer.php'; ?></footer>
</body>
</html>