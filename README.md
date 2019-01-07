# ScalaFix Examples

To run ExternalPackagesRename rule examples: 

```
> cd external-packages-name
> sbt
sbt:example> test:scalafix ExternalPackagesRename
sbt:example> exit
> git diff
```

You should see the package renaming diff done by ExternalPackagesRename rule.
