<template>
<div>
  <nav class="navbar navbar-expand-sm navbar-dark bg-success" style="margin-top: -64px">
    <a class="navbar-brand" href="#">SberHack</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample03" aria-controls="navbarsExample03" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarsExample03">
      <ul class="navbar-nav mr-auto">
        <li class="nav-item active">
          <a class="nav-link" href="#">Главная</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Профиль</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Выход</a>
        </li>
      </ul>
      <form class="form-inline my-2 my-md-0">
        <input class="form-control" type="text" placeholder="Поиск">
      </form>
    </div>
  </nav>
  <main role="main">
    <div class="container">
      <div class="span3">
        <center>
          <h3>Василий Петрович</h3>
          <center>
          <h2>
            <span class="badge badge-success">Участвовал в  3 хакатонах</span>
              <span class="badge badge-success">HS (HackScore):  681 </span>
          </h2>
          </center>

          <v-toolbar color="green" dark>
            <v-toolbar-title>Текущий:</v-toolbar-title>
            <v-spacer></v-spacer>
          </v-toolbar>
          <v-card>
            <v-img
              src="https://cdn.tproger.ru/wp-content/uploads/2019/01/image_2019-01-21_18-42-57.jpg"
              aspect-ratio="3"
            ></v-img>

            <v-card-title primary-title>
              <div>
                <h4 class="headline mb-1">Javathon</h4>
              </div>
            </v-card-title>

            <v-card-actions>
              <v-spacer></v-spacer>
              <!--<router-link :to="{ name: 'hackCard', params: { hackIdParam: 2 }}">Подробнее</router-link>-->
              <v-btn flat color="green">Открыть</v-btn>
            </v-card-actions>
          </v-card>

          <v-card style="margin: 10%; opacity: 0.4">
            <v-img
              src="https://www.pentasia.com/ugc-1/fullnews/news/9127/1662_original.jpg"
              aspect-ratio="3"
            ></v-img>

            <v-card-title primary-title>
              <div>
                <h4 class="headline mb-1">BigData hack</h4>
              </div>
            </v-card-title>
          </v-card>
          <v-card style="margin: 10%; opacity: 0.4">
            <v-img
              src="https://cdn0.tnwcdn.com/wp-content/blogs.dir/1/files/2017/08/gtkWei2-1-796x398.jpg"
              aspect-ratio="3"
            ></v-img>

            <v-card-title primary-title>
              <div>
                <h4 class="headline mb-3">Хакатон по Java</h4>
              </div>
            </v-card-title>
          </v-card>
          <v-card style="margin: 10%; opacity: 0.4">
            <v-img
              src="https://cdn-images-1.medium.com/max/1200/0*ngXgBNNdx6iiWP8q.png"
              aspect-ratio="2.75"
            ></v-img>

            <v-card-title primary-title>
              <div>
                <h3 class="headline mb-0">Хакатон по веб дизайну</h3>
              </div>
            </v-card-title>
          </v-card>
        </center>
      </div>
    </div>
  </main>
</div>
</template>

<script>
export default {
  name: 'UserProfileComponent'
}
</script>

<style scoped>
  .bd-placeholder-img {
    font-size: 1.125rem;
    text-anchor: middle;
  }
  @media (min-width: 768px) {
    .bd-placeholder-img-lg {
      font-size: 3.5rem;
    }
  }
</style>
