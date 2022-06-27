This project shows how to create a java_image through bazel. This particular repository works on Apple M1 with bazel 5.1.1 and io_bazel_rules_docker 25.0

# Build

Build the project with the following command

`
bazel build //...
`

Create the docker image with

`
bazel run //src:cos_image
`

## Fixing "no default C++ toolchain" issue

Please check ".bazelrc" if you are hitting the following error

`
src/BUILD.bazel:8:11: While resolving toolchains for target //src:cos_image.binary: No matching toolchains found for types @bazel_tools//tools/cpp:toolchain_type. Maybe --incompatible_use_cc_configure_from_rules_cc has been flipped and there is no default C++ toolchain added in the WORKSPACE file? See https://github.com/bazelbuild/bazel/issues/10134 for details and migration instructions.
`

In the ".bazelrc", I have disabled transitions.

`
build --@io_bazel_rules_docker//transitions:enable=false
`

