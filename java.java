New project----- java project on the left -----next-----next
B26_Git_Branching----finish

VCS--- Enable Version Control Integration


Create git ignore

 Option 1) right click on project---- new -----file -----.gitignore
   type the normal files to ignore

 Option 2) you select the file/s you want to add to git ignore -----right click on the files----git ----add to gitignore

Commit the changes

Sharing the project

        Sharing by going to git----github----share on github

      -creates a remote repository on github
       -link our project with the remote repository
       -push the changes so far

    or manually


       -gone to github.com-----respositories

       -create a new respository

        -took the link from github, then go to intelliJ, go to git----manage remotes and add the remotes and add click the plusicon. put the URL

     -push the first changes


      created a new branch


      right click on master branch----new branch from master
      we called the branch our names ------checkout to new branch


       made changes on name branch and then commit
       made more changes on name branch and then commit


       push the local name branch to the origin name branch
        (the first time we push a new branch, intelliJ offers t create the origin branch for us


        create a pull request
             What was a pull request:a step between merging branches to allow review of the changes

        1) to to remote repository
             find the pull request menu
              create a new pull request
                 master (base)---name branch (compare)
                     compare/merge the changes in the name branch to the master branch

        assign a reviewer and they will comment,discuss,and then approve changes

         after pull request is approved the branches are merged. In this case the origin master has all the changes so far.

 update my local master

         so far the changes were merged to the origin master and so I needed to checkout to my local master in IntelliJ and update.class

            or you cal pull

           update: gets the changes from the same branch origin/local

          pull:allows you to get the changes fron any branch


