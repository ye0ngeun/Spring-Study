package hello.core.member;

public class MemberServiceImpl implements MemberService {

    // 배우가 직접 담당 배우를 섭외하는 것과 동일 -> 환경 구성에 대한 권한을 Config에 이전하자
//    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
