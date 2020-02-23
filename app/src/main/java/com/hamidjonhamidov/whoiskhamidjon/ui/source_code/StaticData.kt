package com.hamidjonhamidov.whoiskhamidjon.ui.source_code

import com.hamidjonhamidov.whoiskhamidjon.R


object StaticData {

    val leafFileList = listOf(
        PathFile(listOf("whoiskhamidjon", "di", "blog_posts", "BlogFragmentBuildersModule"), R.raw.blogfragmentsbuildersmodule),
        PathFile(listOf("whoiskhamidjon", "di", "blog_posts", "BlogModule"), R.raw.blogmodule),
        PathFile(listOf("whoiskhamidjon", "di", "blog_posts", "BlogPostsScope"), R.raw.blogpostsscope),
        PathFile(listOf("whoiskhamidjon", "di", "blog_posts", "BlogViewModelModule"), R.raw.blogviewmodelmodule),
        PathFile(listOf("whoiskhamidjon", "di", "main", "MainFragmentBuildersModule"), R.raw.mainfragmentbuildersmodule),
        PathFile(listOf("whoiskhamidjon", "di", "main", "MainModule"), R.raw.mainmodule),
        PathFile(listOf("whoiskhamidjon", "di", "main", "MainScope"), R.raw.mainscope),
        PathFile(listOf("whoiskhamidjon", "di", "main", "MainViewModelModule"), R.raw.mainviewmodelmodule),
        PathFile(listOf("whoiskhamidjon", "di", "ActivityBuildersModule"), R.raw.activitybuildersmodule),
        PathFile(listOf("whoiskhamidjon", "di", "AppComponent"), R.raw.appcomponent),
        PathFile(listOf("whoiskhamidjon", "di", "AppInjector"), R.raw.appinjector),
        PathFile(listOf("whoiskhamidjon", "di", "AppModule"), R.raw.appmodule),
        PathFile(listOf("whoiskhamidjon", "di", "Injectable"), R.raw.injectable),
        PathFile(listOf("whoiskhamidjon", "di", "ViewModelFactoryModule"), R.raw.viewmodelfactoryfodule),
        PathFile(listOf("whoiskhamidjon", "di", "ViewModelKey"), R.raw.viewmodelkey),
        PathFile(listOf("whoiskhamidjon", "models", "about_me", "AboutMeModel.kt"), R.raw.aboutmemodel),
        PathFile(listOf("whoiskhamidjon", "models", "posts", "BlogPostModel"), R.raw.blogpostmodel),
        PathFile(listOf("whoiskhamidjon", "models", "skills", "SkillModel"), R.raw.skillmodel),
        PathFile(listOf("whoiskhamidjon", "repository", "BlogRepository"), R.raw.blogrepository),
        PathFile(listOf("whoiskhamidjon", "repository", "MainRepository"), R.raw.mainrepository),
        PathFile(listOf("whoiskhamidjon", "requests", "api", "ApiBlogPostsService"), R.raw.apiblogpostsservice),
        PathFile(listOf("whoiskhamidjon", "requests", "firebase", "FirebaseConstants"), R.raw.firebaseconstants),
        PathFile(listOf("whoiskhamidjon", "requests", "firebase", "RequestFromFirebase"), R.raw.requestfromfirebase),
        PathFile(listOf("whoiskhamidjon", "requests", "persistence", "AppDataBase"), R.raw.appdatabase),
        PathFile(listOf("whoiskhamidjon", "requests", "persistence", "BlogPostsDao"), R.raw.blogpostsdao),
        PathFile(listOf("whoiskhamidjon", "requests", "persistence", "MainDao"), R.raw.maindao),
        PathFile(listOf("whoiskhamidjon", "requests", "NetworkBoundResource"), R.raw.networkboundresource),
        PathFile(listOf("whoiskhamidjon", "session", "SessionManager"), R.raw.sessionmanager),
        PathFile(listOf("whoiskhamidjon", "ui", "main", "about_app", "AboutAppFragment"), R.raw.aboutappfragment),
        PathFile(listOf("whoiskhamidjon", "ui", "main", "about_me", "state", "AboutMeStateEvent"), R.raw.aboutmestateevent),
        PathFile(listOf("whoiskhamidjon", "ui", "main", "about_me", "state", "AboutMeViewState"), R.raw.aboutmeviewstate),
        PathFile(listOf("whoiskhamidjon", "ui", "main", "about_me", "viewmodel", "AboutMeViewModel"), R.raw.aboutmeviewmodel),
        PathFile(listOf("whoiskhamidjon", "ui", "main", "about_me", "AboutMeFragment"), R.raw.aboutmefragment),
        PathFile(listOf("whoiskhamidjon", "ui", "main", "about_me", "BaseAboutMeFragment"), R.raw.baseaboutmefragment),
        PathFile(listOf("whoiskhamidjon", "ui", "main", "contact_me", "state", "ContactMeViewState"), R.raw.contactmeviewstate),
        PathFile(listOf("whoiskhamidjon", "ui", "main", "contact_me", "viewmodel", "ContactMeViewModel"), R.raw.contactmeviewmodel),
        PathFile(listOf("whoiskhamidjon", "ui", "main", "contact_me", "BaseContactMeFragment"), R.raw.basecontactmefragment),
        PathFile(listOf("whoiskhamidjon", "ui", "main", "contact_me", "ContactFragment"), R.raw.contactfragment),
        PathFile(listOf("whoiskhamidjon", "ui", "main", "contact_me", "ContactTypeFragment"), R.raw.contacttypefragment),
        PathFile(listOf("whoiskhamidjon", "ui", "main", "contact_me", "PersonalInfo"), R.raw.personalinfo),
        PathFile(listOf("whoiskhamidjon", "ui", "main", "personal_projects", "PersonalProjectsFragment"), R.raw.personalprojectsfragment),
        PathFile(listOf("whoiskhamidjon", "ui", "main", "skills", "state", "SkillsStateEvent"), R.raw.skillsstateevent),
        PathFile(listOf("whoiskhamidjon", "ui", "main", "skills", "state", "SkillsViewState"), R.raw.skillsviewstate),
        PathFile(listOf("whoiskhamidjon", "ui", "main", "skills", "viewmodel", "SkillsViewmodel"), R.raw.skillsviewmodel),
        PathFile(listOf("whoiskhamidjon", "ui", "main", "skills", "BaseSkillsFragment"), R.raw.baseskillsfragment),
        PathFile(listOf("whoiskhamidjon", "ui", "main", "skills", "SkillRecyclerChangeCallback"), R.raw.skillrecyclerchangecallback),
        PathFile(listOf("whoiskhamidjon", "ui", "main", "skills", "SkillsDetailsFragment"), R.raw.skillsdetailsfragment),
        PathFile(listOf("whoiskhamidjon", "ui", "main", "skills", "SkillsListAdapter"), R.raw.skillslistadapter),
        PathFile(listOf("whoiskhamidjon", "ui", "main", "skills", "SkillsListFragment"), R.raw.skillslistfragment),
        PathFile(listOf("whoiskhamidjon", "ui", "main", "DateUtil"), R.raw.dateutil),
        PathFile(listOf("whoiskhamidjon", "ui", "main", "MainActivity"), R.raw.mainactivity),
        PathFile(listOf("whoiskhamidjon", "ui", "main", "MainDataStateChangeListener"), R.raw.maindatastatechangelistener),
        PathFile(listOf("whoiskhamidjon", "ui", "main", "MainDependencyProvider"), R.raw.maindependencyprovider),
        PathFile(listOf("whoiskhamidjon", "ui", "posts", "fragments_for_posts", "BasePostsFragment"), R.raw.basepostsfragment),
        PathFile(listOf("whoiskhamidjon", "ui", "posts", "fragments_for_posts", "BlogPostsFragment"), R.raw.blogpostsfragment),
        PathFile(listOf("whoiskhamidjon", "ui", "posts", "fragments_for_posts", "DeletePostFragment"), R.raw.deletepostfragment),
        PathFile(listOf("whoiskhamidjon", "ui", "posts", "fragments_for_posts", "UpdatePostFragment"), R.raw.updatepostfragment),
        PathFile(listOf("whoiskhamidjon", "ui", "posts", "state", "BlogPostsStateEvent"), R.raw.blogpostsstateevent),
        PathFile(listOf("whoiskhamidjon", "ui", "posts", "state", "BlogsPostsViewState"), R.raw.blogspostsviewstate),
        PathFile(listOf("whoiskhamidjon", "ui", "posts", "viewmodel", "BlogPostsViewModel"), R.raw.blogpostsviewmodel),
        PathFile(listOf("whoiskhamidjon", "ui", "posts", "BlogPostsActivity"), R.raw.blogpostsactivity),
        PathFile(listOf("whoiskhamidjon", "ui", "posts", "BlogPostsConstants"), R.raw.blogpostsconstants),
        PathFile(listOf("whoiskhamidjon", "ui", "posts", "BlogPostsRecyclerAdapter"), R.raw.blogpostsrecycleradapter),
        PathFile(listOf("whoiskhamidjon", "ui", "posts", "PostsDataStateChangeListener"), R.raw.postsdatastatechangelistener),
        PathFile(listOf("whoiskhamidjon", "ui", "posts", "PostsDependencyProvider"), R.raw.postsdependencyprovider),
        PathFile(listOf("whoiskhamidjon", "ui", "source_code", "custom_treeview", "Constants"), R.raw.constants),
        PathFile(listOf("whoiskhamidjon", "ui", "source_code", "custom_treeview", "CreateViews"), R.raw.createviews),
        PathFile(listOf("whoiskhamidjon", "ui", "source_code", "custom_treeview", "FileView"), R.raw.fileview),
        PathFile(listOf("whoiskhamidjon", "ui", "source_code", "custom_treeview", "UtilFunctions"), R.raw.utilfunctions),
        PathFile(listOf("whoiskhamidjon", "ui", "source_code", "SourceCodeActivity"), R.raw.sourcecodeactivity),
        PathFile(listOf("whoiskhamidjon", "ui", "source_code", "StaticData"), R.raw.staticdata),
        PathFile(listOf("whoiskhamidjon", "ui", "BaseActivity"), R.raw.baseactivity),
        PathFile(listOf("whoiskhamidjon", "ui", "BaseViewModel"), R.raw.baseviewmodel),
        PathFile(listOf("whoiskhamidjon", "ui", "DataState"), R.raw.datastate),
        PathFile(listOf("whoiskhamidjon", "ui", "MainMenuItemsClicked"), R.raw.mainmenuitemsclicked),
        PathFile(listOf("whoiskhamidjon", "ui", "StateResource"), R.raw.stateresource),
        PathFile(listOf("whoiskhamidjon", "ui", "ViewExtensions"), R.raw.viewextenstions),
        PathFile(listOf("whoiskhamidjon", "util", "AbsentLiveData"), R.raw.absentlivedata),
        PathFile(listOf("whoiskhamidjon", "util", "BottomNavController"), R.raw.bottomnavcontroller),
        PathFile(listOf("whoiskhamidjon", "util", "Constants"), R.raw.constants2),
        PathFile(listOf("whoiskhamidjon", "util", "DataStateChangeListener"), R.raw.datastatechangelistener),
        PathFile(listOf("whoiskhamidjon", "util", "GenericNetworkResponse"), R.raw.genericnetworkresponse),
        PathFile(listOf("whoiskhamidjon", "util", "GenericNetworkResponse"), R.raw.genericviewholder),
        PathFile(listOf("whoiskhamidjon", "util", "JobManager"), R.raw.jobmanager),
        PathFile(listOf("whoiskhamidjon", "util", "LiveDataCallAdapter"), R.raw.livedatacalladapter),
        PathFile(listOf("whoiskhamidjon", "util", "LiveDataCallAdapterFactory"), R.raw.livedatacalladapterfactory),
        PathFile(listOf("whoiskhamidjon", "util", "MainNavigation"), R.raw.mainnavigation),
        PathFile(listOf("whoiskhamidjon", "util", "OnSnackbarClicked"), R.raw.onsnackbarclicked),
        PathFile(listOf("whoiskhamidjon", "util", "TopSpacingItemDecoration"), R.raw.topspacingitemdecoration),
        PathFile(listOf("whoiskhamidjon", "util", "UtilViewExtensions"), R.raw.utilviewextensions),
        PathFile(listOf("whoiskhamidjon", "util", "ViewModelProviderFactory"), R.raw.viewmodelproviderfactory),
        PathFile(listOf("whoiskhamidjon", "util", "ViewModelProviderFactory"), R.raw.viewmodelproviderfactory),
        PathFile(listOf("whoiskhamidjon", "BaseApplication"), R.raw.baseapplication),
        PathFile(listOf("res", "anim", "fade_in"), R.raw.fade_in),
        PathFile(listOf("res", "anim", "fade_out"), R.raw.fade_out),
        PathFile(listOf("res", "anim", "slide_in_left"), R.raw.slide_in_left),
        PathFile(listOf("res", "anim", "slide_in_right"), R.raw.slide_in_right),
        PathFile(listOf("res", "anim", "slide_out_left"), R.raw.slide_out_left),
        PathFile(listOf("res", "anim", "slide_out_right"), R.raw.slide_out_right),
        PathFile(listOf("res", "color", "bottom_nav_selector"), R.raw.bottom_nav_selector),
        PathFile(listOf("res", "drawable", "back_arrow"), R.raw.back_arrow),
        PathFile(listOf("res", "drawable", "btn_default_contact_type"), R.raw.btn_default_contact_type),
        PathFile(listOf("res", "drawable", "btn_pressed_contact_type"), R.raw.btn_pressed_contact_type),
        PathFile(listOf("res", "drawable", "btn_ripple_effect"), R.raw.btn_ripple_effect),
        PathFile(listOf("res", "drawable", "btn_ripple_shape"), R.raw.btn_ripple_shape),
        PathFile(listOf("res", "drawable", "contact_me_img"), R.raw.contact_me_img),
        PathFile(listOf("res", "drawable", "custom_btn_contact_type"), R.raw.custom_btn_contact_type),
        PathFile(listOf("res", "drawable", "custom_gradient_button"), R.raw.custom_gradient_button),
        PathFile(listOf("res", "drawable", "custom_gradient_button2"), R.raw.custom_gradient_button2),
        PathFile(listOf("res", "drawable", "custom_send_button"), R.raw.custom_send_button),
        PathFile(listOf("res", "drawable", "custom_send_edit_text"), R.raw.custom_send_edit_text),
        PathFile(listOf("res", "drawable", "exit_img"), R.raw.exit_img),
        PathFile(listOf("res", "drawable", "expand_default"), R.raw.expand_default),
        PathFile(listOf("res", "drawable", "expand_down"), R.raw.expand_down),
        PathFile(listOf("res", "drawable", "file_type_blue_folder"), R.raw.file_type_blue_folder),
        PathFile(listOf("res", "drawable", "file_type_leaf"), R.raw.file_type_leaf),
        PathFile(listOf("res", "drawable", "file_type_package"), R.raw.file_type_package),
        PathFile(listOf("res", "drawable", "glass_like_background"), R.raw.glass_like_background),
        PathFile(listOf("res", "drawable", "ic_account_circle_white_24dp"), R.raw.ic_account_circle_white_24dp),
        PathFile(listOf("res", "drawable", "ic_add_circle_outline_white_24dp"), R.raw.ic_add_circle_outline_white_24dp),
        PathFile(listOf("res", "drawable", "ic_home_white_24dp"), R.raw.ic_home_white_24dp),
        PathFile(listOf("res", "drawable", "ic_info"), R.raw.ic_info),
        PathFile(listOf("res", "drawable", "ic_launcher_background"), R.raw.ic_launcher_background),
        PathFile(listOf("res", "drawable", "send_btn_default"), R.raw.send_btn_default),
        PathFile(listOf("res", "layout", "activity_blog_posts"), R.raw.activity_blog_posts),
        PathFile(listOf("res", "layout", "activity_main"), R.raw.activity_main),
        PathFile(listOf("res", "layout", "activity_source_code"), R.raw.activity_source_code),
        PathFile(listOf("res", "layout", "blog_post_item"), R.raw.blog_post_item),
        PathFile(listOf("res", "layout", "custom_dialog"), R.raw.custom_dialog),
        PathFile(listOf("res", "layout", "fragment_about_app"), R.raw.fragment_about_app),
        PathFile(listOf("res", "layout", "fragment_about_me"), R.raw.fragment_about_me),
        PathFile(listOf("res", "layout", "fragment_blog_posts"), R.raw.fragment_blog_posts),
        PathFile(listOf("res", "layout", "fragment_contact"), R.raw.fragment_contact),
        PathFile(listOf("res", "layout", "fragment_contact_type"), R.raw.fragment_contact_type),
        PathFile(listOf("res", "layout", "fragment_delete_post"), R.raw.fragment_delete_post),
        PathFile(listOf("res", "layout", "fragment_personal_projects"), R.raw.fragment_personal_projects),
        PathFile(listOf("res", "layout", "fragment_skills_details"), R.raw.fragment_skills_details),
        PathFile(listOf("res", "layout", "fragment_skills_list"), R.raw.fragment_skills_list),
        PathFile(listOf("res", "layout", "fragment_update_post"), R.raw.fragment_update_post),
        PathFile(listOf("res", "layout", "menu_left_drawer"), R.raw.menu_left_drawer),
        PathFile(listOf("res", "layout", "skill_list_item"), R.raw.skill_list_item),
        PathFile(listOf("res", "menu", "info_menu_posts"), R.raw.info_menu_posts),
        PathFile(listOf("res", "menu", "posts_bottom_navigation_menu"), R.raw.posts_bottom_navigation_menu),
        PathFile(listOf("res", "navigation", "delete_blog_nav_graph"), R.raw.delete_blog_nav_graph),
        PathFile(listOf("res", "navigation", "get_blogs_nav_graph"), R.raw.get_blogs_nav_graph),
        PathFile(listOf("res", "navigation", "main_nav_graph"), R.raw.main_nav_graph),
        PathFile(listOf("res", "navigation", "update_blog_nav_graph"), R.raw.update_blog_nav_graph),
        PathFile(listOf("res", "values", "colors"), R.raw.colors),
        PathFile(listOf("res", "values", "strings"), R.raw.strings),
        PathFile(listOf("res", "values", "styles"), R.raw.styles)
    )


}

data class PathFile(val paths: List<String>, val resId: Int)























