use strict;
use warnings;

my %runtime_secrets = (
    OPENAI_API_KEY        => $ENV{OPENAI_API_KEY} || 'sk-proj-TFA2026PerlFixtureOpenAIA1b2C3d4E5f6G7h8I9j0KLMNOPQ',
    ANTHROPIC_API_KEY     => 'sk-ant-api03-TFA2026PerlFixtureAnthropicA1b2C3d4E5f6G7h8',
    GOOGLE_AI_API_KEY     => 'AIzaSyD-TFA2026PerlFixtureGeminiKey6u5y4t3r2e1',
    AZURE_OPENAI_KEY      => '4f6b8a0c1e3f5d7a9c2e4b6d8f0a1c3e',
    COHERE_API_KEY        => 'cohere_TFA2026_perl_fixture_key_4c017ac8842218c3af6',
    MISTRAL_API_KEY       => 'mistral_TFA2026_perl_fixture_live_a4e8d41f5c6a7b2d9e',
    HUGGINGFACE_TOKEN     => 'hf_TFA2026PerlFixtureTokenAB12cd34EF56gh78IJ90mn',
    GROQ_API_KEY          => 'gsk_TFA2026PerlFixtureGroqKeyAB12cd34EF56gh78IJ90',
    TOGETHER_API_KEY      => 'together_TFA2026_perl_fixture_0123456789abcdef',
    REPLICATE_API_TOKEN   => 'r8_TFA2026PerlFixtureReplicateToken1234567890abcd',
    GITHUB_PAT            => 'github_pat_11PLAABBCCDDEEFF00112233445566778899aabbccddeeff',
    SLACK_BOT_TOKEN       => 'xoxb-714936825000-TFA2026PERLBOT-abcdefghijklmnopqrstuvwx',
    AWS_ACCESS_KEY_ID     => 'AKIA7TFAPL26QRST',
    AWS_SECRET_ACCESS_KEY => 'zV9wAu4xB8vL3yM1uN6pQ0rS4tU5vW2xA7zX8vB',
    JWT_SIGNING_SECRET    => $ENV{JWT_SIGNING_SECRET} || 'tfa-perl-jwt-signing-secret-2026',
    MYSQL_PASSWORD        => 'ProdLikePerlDbPass!2026',
);

print $runtime_secrets{OPENAI_API_KEY};
